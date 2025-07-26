package com.lineup.skku.marker.marker.entity

import com.lineup.skku.area.Area
import com.lineup.skku.common.Hour
import com.lineup.skku.common.Link
import com.lineup.skku.common.Point
import com.lineup.skku.marker.category.Category
import jakarta.persistence.*
import java.time.LocalTime

@Entity
class Stop (
    id: Long,
    area: Area?,
    category: Category?,
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
    private val times: MutableList<LocalTime> = mutableListOf()
) : Marker(id, area, category, name, summary, description, point, hour, images, links)