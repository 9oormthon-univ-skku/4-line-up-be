package com.lineup.skku.area

import com.lineup.skku.common.BaseEntity
import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "area_image")
class AreaImageEntity (
    val areaId: Long,
    val src: String,
) : BaseEntity()
