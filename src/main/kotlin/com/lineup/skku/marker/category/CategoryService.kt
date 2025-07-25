package com.lineup.skku.marker.category

import com.lineup.skku.category.category.CategoryMapper
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class CategoryService (
    private val repository : CategoryRepository
){
    private val mapper = CategoryMapper.INSTANCE

    @Transactional(readOnly = true)
    fun findAll(): List<Category> {
        return repository.findAll()
    }

    fun create(category: Category): Category {
        repository.save(category)
        return category
    }

    fun update(id: Long, dto: CategoryUpdateDto) {
        val found = repository.findByIdOrThrow(id)
        mapper.update(dto, found)
    }

    fun delete(id: Long) {
        repository.deleteByIdOrThrow(id)
    }
}