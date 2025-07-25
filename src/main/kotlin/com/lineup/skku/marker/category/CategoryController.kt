package com.lineup.skku.category.category

import com.lineup.skku.common.toUri
import com.lineup.skku.marker.category.Category
import com.lineup.skku.marker.category.CategoryCreateDto
import com.lineup.skku.marker.category.CategoryService
import com.lineup.skku.marker.category.CategoryUpdateDto
import jakarta.validation.Valid
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RequestMapping("/categories")
@RestController
class CategoryController (
    private val categoryService: CategoryService
) {
    private val categoryMapper = CategoryMapper.Companion.INSTANCE

    @PostMapping
    fun create(@Valid @RequestBody dto: CategoryCreateDto): ResponseEntity<Long> {
        val new = categoryMapper.toEntity(dto)
        val saved = categoryService.create(new)
        return ResponseEntity.created("/categories/${saved.id}".toUri())
            .body(saved.id)
    }

    @GetMapping
    fun findAll(): ResponseEntity<List<Category>> {
        val result = categoryService.findAll()
        return ResponseEntity.ok(result)
    }

    @PatchMapping("/{id}")
    fun update(
        @PathVariable id: Long,
        @RequestBody dto: CategoryUpdateDto
    ): ResponseEntity<Void> {
        categoryService.update(id, dto)
        return ResponseEntity.ok().build()
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long): ResponseEntity<Void> {
        categoryService.delete(id)
        return ResponseEntity.ok().build()
    }
}