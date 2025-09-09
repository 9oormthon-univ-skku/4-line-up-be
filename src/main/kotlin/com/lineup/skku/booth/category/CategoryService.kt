package com.lineup.skku.booth.category

import com.lineup.skku.booth.booth.BoothRepository
import com.lineup.skku.common.CodeException
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class CategoryService (
    private val categoryRepository : CategoryRepository,
    private val boothRepository: BoothRepository,
    private val categoryConverter: CategoryConverter
){
    @Transactional(readOnly = true)
    fun findAll(): List<Category> {
        return categoryRepository.findAll()
    }

    @Transactional(readOnly = true)
    fun findById(id: Long): Category {
        return categoryRepository.findByIdOrThrow(id)
    }

    fun create(dto: CategoryCreateDto): Category {
        val new = categoryConverter.toEntity(dto)
        return categoryRepository.save(new)
    }

    fun update(id: Long, dto: CategoryUpdateDto) {
        val found = categoryRepository.findByIdOrThrow(id)
        found.update(dto)
        categoryRepository.save(found)
    }

    fun delete(id: Long) {
        val found = categoryRepository.findByIdOrThrow(id)
        if (boothRepository.findAllByCategory_Id(id).isNotEmpty())
            throw CodeException(CategoryExceptionCode.DELETE_CATEGORY_WITH_BOOTH)
        categoryRepository.delete(found)
    }
}