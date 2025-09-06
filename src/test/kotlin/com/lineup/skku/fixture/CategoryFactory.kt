package com.lineup.skku.fixture

import com.lineup.skku.booth.category.Category
import com.lineup.skku.booth.category.CategoryRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class CategoryFactory {

    @Autowired private lateinit var categoryRepository: CategoryRepository

    fun create(name: String) : Category {
        val category = Category(0L, name, "icon", "color")
        return categoryRepository.save(category)
    }
}