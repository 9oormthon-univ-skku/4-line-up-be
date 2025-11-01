package com.lineup.skku.booth.booth.entity

import com.lineup.skku.common.BaseEntity
import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "booth_area")
class BoothAreaEntity (
    val boothId: Long,
    val areaId: Long,
) : BaseEntity()