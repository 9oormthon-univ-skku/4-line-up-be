package com.lineup.skku.post

import org.springframework.stereotype.Component

@Component
class PostConverter {

    fun toEntity(dto: PostCreateDto): Post {
        return Post(
            0L,
            dto.title,
            dto.content,
            dto.images.toMutableList(),
            dto.links.toMutableList()
        )
    }

}