package com.lineup.skku.booth.booth.entity

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BoothRepository: JpaRepository<BoothEntity, Long> {
    fun findAllByAreaId(areaId: Long): List<BoothEntity>
    fun findAllByCategoryId(categoryId: Long): List<BoothEntity>
}