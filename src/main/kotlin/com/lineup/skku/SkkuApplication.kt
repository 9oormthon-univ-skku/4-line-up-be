package com.lineup.skku

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@SpringBootApplication
class SkkuApplication

fun main(args: Array<String>) {
	runApplication<SkkuApplication>(*args)
}
