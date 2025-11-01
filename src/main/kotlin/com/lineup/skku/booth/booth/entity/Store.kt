package com.lineup.skku.booth.booth.entity

import com.lineup.skku.area.Area
import com.lineup.skku.booth.booth.StoreUpdateDto
import com.lineup.skku.booth.category.Category
import com.lineup.skku.booth.menu.Menu
import com.lineup.skku.common.Hour
import com.lineup.skku.common.Link
import com.lineup.skku.common.Point
import jakarta.persistence.CascadeType
import jakarta.persistence.Entity
import jakarta.persistence.FetchType
import jakarta.persistence.OneToMany

@Entity
class Store (
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
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "store", cascade = [CascadeType.ALL], orphanRemoval = true)
    val menus: MutableList<Menu> = mutableListOf()
) : Booth(area?.id, category, name, summary, description, point, hour, images, links) {
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