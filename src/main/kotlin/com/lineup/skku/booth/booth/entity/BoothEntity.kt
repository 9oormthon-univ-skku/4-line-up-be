package com.lineup.skku.booth.booth.entity

import com.lineup.skku.booth.booth.BoothExceptionCode
import com.lineup.skku.booth.booth.BoothUpdateRequest
import com.lineup.skku.common.BaseEntity
import com.lineup.skku.common.CodeException
import com.lineup.skku.common.Hour
import com.lineup.skku.common.Point
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.Inheritance
import jakarta.persistence.InheritanceType
import jakarta.persistence.Table

@Entity
@Table(name = "booth")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
class BoothEntity (
    areaId: Long?,
    categoryId: Long,
    @Enumerated(EnumType.STRING)
    val dtype: BoothType,
    thumbnail: String,
    name: String,
    summary: String?,
    description: String,
    point: Point,
    hour: Hour,
    gateType: GateType?,
) : BaseEntity() {
    var areaId: Long? = areaId
        protected set

    var categoryId: Long = categoryId
        protected set

    var thumbnail: String = thumbnail
        protected set

    var name: String = name
        protected set

    var summary: String? = summary
        protected set

    var description: String = description
        protected set

    var point: Point = point
        protected set

    var hour: Hour = hour
        protected set

    @Enumerated(EnumType.STRING)
    var gateType: GateType? = gateType
        protected set

    fun update(request: BoothUpdateRequest) {
        areaId = request.areaId ?: areaId
        categoryId = request.categoryId ?: categoryId
        thumbnail = request.images?.get(0) ?: thumbnail
        name = request.name ?: name
        summary = request.summary ?: summary
        description = request.description ?: description
        point = request.point ?: point
        hour = request.hour ?: hour
    }

    fun validate() {
        if (dtype == BoothType.GATE && gateType == null) throw CodeException(BoothExceptionCode.INVALID_BOOTH)
        if (dtype != BoothType.GATE && gateType != null) throw CodeException(BoothExceptionCode.INVALID_BOOTH)
    }
}

enum class BoothType {
    BOOTH, GATE, STORE
}

enum class GateType {
    ENTRY, EXIT, ALL
}