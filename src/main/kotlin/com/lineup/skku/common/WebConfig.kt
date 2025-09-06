package com.lineup.skku.common

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class WebConfig : WebMvcConfigurer {
    override fun addCorsMappings(registry: CorsRegistry) {
        registry.addMapping("/**")
            .allowedOrigins(
                "http://localhost:3000",
                "https://localhost:3000",
                "http://localhost:5173",
                "https://localhost:5173",
                "http://line-up-preview.vercel.app",
                "https://line-up-preview.vercel.app",
                "http://line-up-main.vercel.app",
                "https://line-up-main.vercel.app",
                "http://eskara.line-up.kr",
                "https://eskara.line-up.kr"
            )
            .allowedMethods("*")
            .allowedHeaders("*")
            .exposedHeaders("*")
            .allowCredentials(true)
            .maxAge(3600)
    }
}