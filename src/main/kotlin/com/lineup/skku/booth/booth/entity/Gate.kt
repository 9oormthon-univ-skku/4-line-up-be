package com.lineup.skku.booth.booth.entity

import com.lineup.skku.area.Area
import com.lineup.skku.common.Hour
import com.lineup.skku.common.Link
import com.lineup.skku.common.Point
import com.lineup.skku.booth.category.Category
import com.lineup.skku.booth.booth.GateUpdateDto
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated

@Entity
class Gate (
    id: Long,
    area: Area?,
    category: Category,
    name: String,
    summary: String?,
    description: String,
    point: Point,
    hour: Hour,
    images: MutableList<String> = mutableListOf(),
    links: MutableList<Link> = mutableListOf(),
    @Column
    @Enumerated(EnumType.STRING)
    var type: GateType,

) : Booth(area?.id, category, name, summary, description, point, hour, images, links) {

    fun update(dto: GateUpdateDto) {
        name = dto.name ?: name
        summary = dto.summary ?: summary
        description = dto.description ?: description
        point = dto.point ?: point
        hour = dto.hour ?: hour
        type = dto.type ?: type
        if (dto.images != null) {
            images.clear()
            images.addAll(dto.images)
        }
        if (dto.links != null) {
            links.clear()
            links.addAll(dto.links)
        }
    }

}