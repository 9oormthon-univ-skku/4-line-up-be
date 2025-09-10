package com.lineup.skku.common

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/health")
@RestController
class HealthController () {
    @GetMapping
    fun findAll(): ResponseEntity<Void> {
        return ResponseEntity.ok().build()
    }
}