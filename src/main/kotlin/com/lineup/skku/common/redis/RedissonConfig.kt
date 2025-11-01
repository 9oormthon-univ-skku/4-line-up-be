package com.lineup.skku.common.redis

import org.redisson.Redisson
import org.redisson.api.RedissonClient
import org.redisson.config.Config
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


/*
 * RedissonClient Configuration
 */
@Configuration
class RedissonConfig (
    @Value("\${spring.data.redis.host}")
    private val redisHost: String,
    @Value("\${spring.data.redis.port}")
    private val redisPort: Int
) {

    @Bean
    fun redissonClient(): RedissonClient {
        val config = Config()
        config.useSingleServer().address = "$REDISSON_HOST_PREFIX$redisHost:$redisPort"

        val redisson = Redisson.create(config)  
        return redisson
    }

    companion object {
        private const val REDISSON_HOST_PREFIX = "redis://"
    }
}