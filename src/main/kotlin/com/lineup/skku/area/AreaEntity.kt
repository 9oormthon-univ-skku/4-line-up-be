package com.lineup.skku.area

import com.lineup.skku.common.BaseEntity
import com.lineup.skku.common.Hour
import com.lineup.skku.common.Point
import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "area")
class AreaEntity (
    name: String,
    summary: String?,
    point: Point,
    hour: Hour,
) : BaseEntity() {
    var name: String = name
        protected set

    var summary: String? = summary
        protected set

    var point: Point = point
        protected set

    var hour: Hour = hour
        protected set

    fun update(request: AreaUpdateRequest) {
        name = request.name ?: name
        summary = request.summary ?: summary
        point = request.point ?: point
        hour = request.hour ?: hour
    }
}
