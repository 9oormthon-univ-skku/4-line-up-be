package com.lineup.skku.post

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class PostService (
    private val repository : PostRepository,
    private val converter: PostConverter
){
    @Transactional(readOnly = true)
    fun findAll(): List<Post> {
        return repository.findAll()
    }

    fun create(dto: PostCreateDto): Post {
        val new = converter.toEntity(dto)
        return repository.save(new)
    }

    fun update(id: Long, dto: PostUpdateDto) {
        val found = repository.findByIdOrThrow(id)
        found.update(dto)
        repository.save(found)
    }

    fun delete(id: Long) {
        repository.deleteByIdOrThrow(id)
    }
}