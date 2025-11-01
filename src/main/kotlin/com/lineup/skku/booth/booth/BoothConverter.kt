package com.lineup.skku.booth.booth

import com.lineup.skku.area.Area
import com.lineup.skku.booth.category.Category
import com.lineup.skku.booth.booth.entity.Gate
import com.lineup.skku.booth.booth.entity.Booth
import com.lineup.skku.booth.booth.entity.Stop
import com.lineup.skku.booth.booth.entity.Store
import org.springframework.stereotype.Component

@Component
class BoothConverter {

    fun toEntity(area: Area?, category: Category, dto: BoothCreateDto): Booth {
        if(dto is GateCreateDto) return toEntity(area, category, dto)
        if(dto is StopCreateDto) return toEntity(area, category, dto)
        if(dto is StoreCreateDto) return toEntity(area, category, dto)

        return Booth(
            area?.id,
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