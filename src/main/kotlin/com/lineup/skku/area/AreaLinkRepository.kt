package com.lineup.skku.area

import org.springframework.data.jpa.repository.JpaRepository

interface AreaLinkRepository: JpaRepository<AreaLinkEntity, Long> {
    fun findByAreaIdIn(areaIds: Collection<Long>): List<AreaLinkEntity>
    fun findByAreaId(areaId: Long): List<AreaLinkEntity>
    fun deleteByAreaId(areaId: Long)
}