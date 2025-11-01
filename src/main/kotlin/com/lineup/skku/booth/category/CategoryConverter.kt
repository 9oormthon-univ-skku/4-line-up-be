package com.lineup.skku.booth.category

import org.springframework.stereotype.Component

@Component
class CategoryConverter {

    fun toEntity(dto: CategoryCreateDto): Category {
        return Category(
            dto.name,
            dto.icon,
            dto.color,
        )
    }
}