package com.lineup.skku.booth.booth.entity

import org.springframework.data.jpa.repository.JpaRepository

interface BoothLinkRepository: JpaRepository<BoothLinkEntity, Long> {
    fun findByBoothId(boothId: Long): List<BoothLinkEntity>
    fun deleteByBoothId(boothId: Long)
}