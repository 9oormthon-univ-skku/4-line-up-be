package com.lineup.skku.booth.booth.entity

import org.springframework.data.jpa.repository.JpaRepository

interface BoothImageRepository: JpaRepository<BoothImageEntity, Long> {
    fun findByBoothId(postId: Long): List<BoothImageEntity>
    fun deleteByBoothId(postId: Long)
}