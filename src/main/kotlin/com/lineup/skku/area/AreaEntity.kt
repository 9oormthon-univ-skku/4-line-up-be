package com.lineup.skku.area

import com.lineup.skku.common.BaseEntity
import com.lineup.skku.common.Hour
import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "area")
class AreaEntity (
    name: String,
    summary: String?,
    description: String,
    hour: Hour,
) : BaseEntity() {
    var name: String = name
        protected set

    var summary: String? = summary
        protected set

    var description: String = description
        protected set

    var hour: Hour = hour
        protected set

fun update(request: AreaUpdateRequest) {
        name = request.name ?: name
        summary = request.summary ?: summary
        description = request.description ?: description
        hour = request.hour ?: hour
    }
}
