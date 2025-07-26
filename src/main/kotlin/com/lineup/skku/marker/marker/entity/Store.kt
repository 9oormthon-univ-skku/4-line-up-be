package com.lineup.skku.marker.marker.entity

import com.lineup.skku.area.Area
import com.lineup.skku.common.Hour
import com.lineup.skku.common.Link
import com.lineup.skku.common.Point
import com.lineup.skku.marker.category.Category
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
) : Marker(id, area, category, name, summary, description, point, hour, images, links)