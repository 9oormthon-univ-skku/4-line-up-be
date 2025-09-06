package com.lineup.skku.booth.category

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class CategoryService (
    private val repository : CategoryRepository,
    private val converter: CategoryConverter
){
    @Transactional(readOnly = true)
    fun findAll(): List<Category> {
        return repository.findAll()
    }

    @Transactional(readOnly = true)
    fun findById(id: Long): Category {
        return repository.findByIdOrThrow(id)
    }

    fun create(dto: CategoryCreateDto): Category {
        val new = converter.toEntity(dto)
        return repository.save(new)
    }

    fun update(id: Long, dto: CategoryUpdateDto) {
        val found = repository.findByIdOrThrow(id)
        found.update(dto)
        repository.save(found)
    }

    fun delete(id: Long) {
        repository.deleteByIdOrThrow(id)
    }
}