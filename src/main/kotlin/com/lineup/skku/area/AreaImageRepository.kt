package com.lineup.skku.area

import org.springframework.data.jpa.repository.JpaRepository

interface AreaImageRepository: JpaRepository<AreaImageEntity, Long> {
    fun findByAreaIdIn(areaIds: Collection<Long>): List<AreaImageEntity>
    fun findByAreaId(areaId: Long): List<AreaImageEntity>
    fun deleteByAreaId(areaId: Long)
}