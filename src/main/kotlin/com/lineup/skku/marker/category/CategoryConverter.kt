package com.lineup.skku.marker.category

import org.springframework.stereotype.Component

@Component
class CategoryConverter {

    fun toEntity(dto: CategoryCreateDto): Category {
        return Category(
            0L,
            dto.name,
            dto.icon,
            dto.color,
        )
    }
}