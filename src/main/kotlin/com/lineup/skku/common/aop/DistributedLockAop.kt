package com.lineup.skku.common.aop

import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.reflect.MethodSignature
import org.redisson.api.RedissonClient
import org.springframework.stereotype.Component
import java.lang.reflect.Method


/**
 * @DistributedLock 선언 시 수행되는 Aop class
 */
@Aspect
@Component
class DistributedLockAop (
    private val redissonClient: RedissonClient,
    private val aopForTransaction: AopForTransaction
) {
    @Around("@annotation(com.lineup.skku.common.aop.DistributedLock)")
    @Throws(Throwable::class)
    fun lock(joinPoint: ProceedingJoinPoint): Any? {
        val signature = joinPoint.signature as MethodSignature
        val method: Method = signature.method
        val distributedLock: DistributedLock = method.getAnnotation(DistributedLock::class.java)!!

        val key = REDISSON_LOCK_PREFIX + SpELParser.getDynamicValue(
            signature.parameterNames,
            joinPoint.args,
            distributedLock.key
        )
        val rLock = redissonClient.getLock(key)

        try {
            val available =
                rLock.tryLock(distributedLock.waitTime, distributedLock.leaseTime, distributedLock.timeUnit)
            if (!available) {
                return false
            }
            return aopForTransaction.proceed(joinPoint)
        } catch (e: InterruptedException) {
            throw InterruptedException()
        } finally {
            try {
                rLock.unlock()
            } catch (e: IllegalMonitorStateException) {
//                log.info(
//                    "Redisson Lock Already UnLock {} {}",
//                    kv("serviceName", method.name),
//                    kv("key", key)
//                )
            }
        }
    }

    companion object {
        private const val REDISSON_LOCK_PREFIX = "LOCK:"
    }
}