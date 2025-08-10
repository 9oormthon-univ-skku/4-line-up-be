package com.lineup.skku.area

import org.springframework.stereotype.Component

@Component
class AreaConverter {

    fun toEntity(dto: AreaCreateDto): Area {
        return Area(
            0L,
            dto.name,
            dto.summary,
            dto.description,
            dto.hour,
            dto.images.toMutableList(),
            dto.links.toMutableList(),
        )
    }
}