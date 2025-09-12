package com.lineup.skku.booth.booth.entity

import com.lineup.skku.area.Area
import com.lineup.skku.common.Hour
import com.lineup.skku.common.Link
import com.lineup.skku.common.Point
import com.lineup.skku.booth.category.Category
import com.lineup.skku.booth.booth.StopUpdateDto
import jakarta.persistence.*
import java.time.LocalTime

@Entity
class Stop (
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
    @ElementCollection(fetch = FetchType.EAGER)
    @JoinTable(name = "stop_time",
        joinColumns = [JoinColumn(name = "stop_id")])
    @Column(name = "time")
    val times: MutableList<LocalTime> = mutableListOf()

) : Booth(id, area, category, name, summary, description, point, hour, images, links) {

    fun update(dto: StopUpdateDto) {
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
        if (dto.times != null) {
            times.clear()
            times.addAll(dto.times)
        }
    }

}