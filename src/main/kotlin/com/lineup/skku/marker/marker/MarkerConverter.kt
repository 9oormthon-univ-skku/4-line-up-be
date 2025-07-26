package com.lineup.skku.marker.marker

import com.lineup.skku.area.Area
import com.lineup.skku.marker.category.Category
import com.lineup.skku.marker.marker.entity.Gate
import com.lineup.skku.marker.marker.entity.Marker
import com.lineup.skku.marker.marker.entity.Stop
import com.lineup.skku.marker.marker.entity.Store
import org.springframework.stereotype.Component

@Component
class MarkerConverter {

    fun toEntity(area: Area?, category: Category, dto: MarkerCreateDto): Marker {
        if(dto is GateCreateDto) return toEntity(area, category, dto)
        if(dto is StopCreateDto) return toEntity(area, category, dto)
        if(dto is StoreCreateDto) return toEntity(area, category, dto)

        return Marker(
            0L,
            area,
            category,
            dto.name,
            dto.summary,
            dto.description,
            dto.point,
            dto.hour,
            dto.images.toMutableList(),
            dto.links.toMutableList()
        )
    }

    fun toEntity(area: Area?, category: Category, dto: GateCreateDto): Gate {
        return Gate(
            0L,
            area,
            category,
            dto.name,
            dto.summary,
            dto.description,
            dto.point,
            dto.hour,
            dto.images.toMutableList(),
            dto.links.toMutableList(),
            dto.type
        )
    }

    fun toEntity(area: Area?, category: Category, dto: StopCreateDto): Stop {
        return Stop(
            0L,
            area,
            category,
            dto.name,
            dto.summary,
            dto.description,
            dto.point,
            dto.hour,
            dto.images.toMutableList(),
            dto.links.toMutableList(),
            dto.times.toMutableList()
        )
    }

    fun toEntity(area: Area?, category: Category, dto: StoreCreateDto): Store {
        return Store(
            0L,
            area,
            category,
            dto.name,
            dto.summary,
            dto.description,
            dto.point,
            dto.hour,
            dto.images.toMutableList(),
            dto.links.toMutableList()
        )
    }

}