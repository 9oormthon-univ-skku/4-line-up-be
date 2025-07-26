package com.lineup.skku.marker.marker.entity

import com.lineup.skku.area.Area
import com.lineup.skku.common.Hour
import com.lineup.skku.common.Link
import com.lineup.skku.common.Point
import com.lineup.skku.marker.category.Category
import com.lineup.skku.marker.marker.StoreUpdateDto
import jakarta.persistence.Entity

@Entity
class Store (
    id: Long,
    area: Area?,
    category: Category?,
    name: String,
    summary: String?,
    description: String,
    point: Point,
    hour: Hour,
    images: MutableList<String> = mutableListOf(),
    links: MutableList<Link> = mutableListOf()

) : Marker(id, area, category, name, summary, description, point, hour, images, links) {

    fun update(dto: StoreUpdateDto) {
        name = dto.name ?: name
        summary = dto.summary ?: summary
        description = dto.description ?: description
        point = dto.point ?: point
        hour = dto.hour ?: hour
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