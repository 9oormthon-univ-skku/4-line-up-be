package com.lineup.skku.booth.category

import com.lineup.skku.booth.booth.entity.BoothRepository
import com.lineup.skku.common.CodeException
import com.lineup.skku.common.redis.CacheTemplate
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import kotlin.jvm.optionals.getOrNull

@Service
class CategoryService (
    private val categoryRepository : CategoryRepository,
    private val boothRepository: BoothRepository,
    private val cacheTemplate: CacheTemplate
){
    @Transactional(readOnly = true)
    fun findAll(): List<Category> {
        return cacheTemplate.findCache("categories",
            {
                categoryRepository.findAll().map {
                    Category(
                        it.id,
                        it.name,
                        it.icon,
                        it.color
                    )
                }
            }, CodeException(CategoryExceptionCode.NOT_FOUND))
    }

    @Transactional(readOnly = true)
    fun findById(id: Long): Category {
        return cacheTemplate.findCache("categories",
            {
                val category = categoryRepository.findById(id).getOrNull()
                if (category != null) {
                    Category(category.id, category.name, category.icon, category.color)
                } else null
            }, CodeException(CategoryExceptionCode.NOT_FOUND))
    }

    @Transactional
    fun create(request: CategoryCreateRequest): Category {
        val category = CategoryEntity(
            request.name,
            request.icon,
            request.color
        )
        categoryRepository.save(category)
        cacheTemplate.removeCache("categories")

        return Category(
            category.id,
            category.name,
            category.icon,
            category.color
        )
    }

    @Transactional
    fun update(id: Long, request: CategoryUpdateRequest) {
        val category = categoryRepository.findByIdOrNull(id)?.takeIf { it.isActive() }
            ?: throw CodeException(CategoryExceptionCode.NOT_FOUND)

        category.update(request)
        categoryRepository.save(category)
        cacheTemplate.removeCache("categories")
    }

    @Transactional
    fun delete(id: Long) {
        val category = categoryRepository.findByIdOrNull(id)?.takeIf { it.isActive() }
            ?: throw CodeException(CategoryExceptionCode.NOT_FOUND)

        if (boothRepository.findAllByCategoryId(id).isNotEmpty())
            throw CodeException(CategoryExceptionCode.DELETE_CATEGORY_WITH_BOOTH)

        categoryRepository.delete(category)
        cacheTemplate.removeCache("categories")
    }
}