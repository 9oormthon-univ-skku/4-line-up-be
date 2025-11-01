package com.lineup.skku.common.redis

import com.lineup.skku.common.CodeException
import com.lineup.skku.common.CommonExceptionCode
import io.github.oshai.kotlinlogging.KotlinLogging
import org.redisson.api.RBucket
import org.redisson.api.RedissonClient
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Propagation
import org.springframework.transaction.annotation.Transactional
import java.lang.Thread.sleep
import java.time.Duration
import java.util.concurrent.ThreadLocalRandom
import java.util.concurrent.TimeUnit


private val logger = KotlinLogging.logger { }

@Service
@Transactional(propagation = Propagation.REQUIRES_NEW)
class CacheTemplate (
    private val redissonClient: RedissonClient
) {

    fun <T: Any> findCache(key: String, loader: () -> T?, error: CodeException): T {

        // hit
        val bucket: RBucket<T> = redissonClient.getBucket(REDISSON_CACHE_PREFIX + key)
        if(bucket.isExists && bucket.get() == null) throw error
        if(bucket.isExists) return bucket.get()

        // miss
        for(retry in 0..< MAX_RETRY_COUNT) {
            val lock = redissonClient.getLock(REDISSON_LOCK_PREFIX + key)
            val lockAcquired = lock.tryLock(LOCK_TIMEOUT_MS, LOCK_LEASE_MS, TimeUnit.MILLISECONDS)

            if(!lockAcquired) {
                // retry
                logger.info { "Race condition occurred. key: $key, retry: $retry" }
                val jitter = ThreadLocalRandom.current().nextLong(RETRY_DELAY_JITTER_MS)
                sleep(RETRY_DELAY_MS + jitter)
                continue
            }

            try {
                // dcl
                val bucket: RBucket<T> = redissonClient.getBucket(REDISSON_CACHE_PREFIX + key)
                if(bucket.isExists && bucket.get() == null) throw error
                if(bucket.isExists) return bucket.get()

                // sync
                val found: T? = loader.invoke()
                if(found == null) {
                    val jitter = ThreadLocalRandom.current().nextLong(JITTER_RANGE)
                    bucket.set(null, TTL_BASE.plus(Duration.ofMillis(jitter)))
                    throw error
                }

                bucket.set(found)
                return found
            } finally {
                try {
                    lock.unlock()
                } catch (e: IllegalMonitorStateException) {
                    logger.info { "Lock already unlocked. key: ${key}" }
                }
            }
        }
        throw CodeException(CommonExceptionCode.REDIS_LOCK_FAILURE)
    }

    fun removeCache(key: String) {
        val bucket: RBucket<Any> = redissonClient.getBucket(REDISSON_CACHE_PREFIX + key)
        bucket.delete()
    }

    companion object {
        private const val REDISSON_CACHE_PREFIX = "cache:"
        private const val REDISSON_LOCK_PREFIX = "lock:"

        private const val LOCK_TIMEOUT_MS: Long = 400
        private const val LOCK_LEASE_MS: Long = 50

        private val TTL_BASE: Duration = Duration.ofMillis(5000)
        private const val JITTER_RANGE: Long = 10

        private const val MAX_RETRY_COUNT: Int = 5
        private const val RETRY_DELAY_MS: Long = 5
        private const val RETRY_DELAY_JITTER_MS: Long = 15
    }
}