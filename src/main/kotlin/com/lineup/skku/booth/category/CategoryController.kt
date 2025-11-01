package com.lineup.skku.booth.category

import com.lineup.skku.common.toUri
import jakarta.validation.Valid
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RequestMapping("/categories")
@RestController
class CategoryController (
    private val service: CategoryService,
) {

    @PostMapping
    fun create(@Valid @RequestBody request: CategoryCreateRequest): ResponseEntity<Long> {
        val result = service.create(request)
        return ResponseEntity.created("/categories/${result.id}".toUri())
            .body(result.id)
    }

    @GetMapping
    fun findAll(): ResponseEntity<List<Category>> {
        val result = service.findAll()
        return ResponseEntity.ok(result)
    }

    @PatchMapping("/{id}")
    fun update(
        @PathVariable id: Long,
        @RequestBody request: CategoryUpdateRequest
    ): ResponseEntity<Void> {
        service.update(id, request)
        return ResponseEntity.ok().build()
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long): ResponseEntity<Void> {
        service.delete(id)
        return ResponseEntity.ok().build()
    }
}