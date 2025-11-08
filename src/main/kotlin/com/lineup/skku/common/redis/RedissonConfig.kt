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
    @Value("\${spring.data.redis.url}")
    private val redisUrl: String,
    @Value("\${spring.data.redis.port}")
    private val redisPort: Int
) {

    @Bean
    fun redissonClient(): RedissonClient {
        val config = Config()
        config.useSingleServer().address = "$redisUrl:$redisPort"

        val redisson = Redisson.create(config)  
        return redisson
    }
}