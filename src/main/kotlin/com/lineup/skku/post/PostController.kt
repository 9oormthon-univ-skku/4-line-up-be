package com.lineup.skku.post

import com.lineup.skku.common.toUri
import jakarta.validation.Valid
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RequestMapping("/posts")
@RestController
class PostController (
    private val service: PostService,
) {

    @PostMapping
    fun create(@Valid @RequestBody dto: PostCreateDto): ResponseEntity<Long> {
        val saved = service.create(dto)
        return ResponseEntity.created("/posts/${saved.id}".toUri())
            .body(saved.id)
    }

    @GetMapping
    fun findAll(): ResponseEntity<List<Post>> {
        val result = service.findAll()
        return ResponseEntity.ok(result)
    }

    @PatchMapping("/{id}")
    fun update(
        @PathVariable id: Long,
        @RequestBody dto: PostUpdateDto
    ): ResponseEntity<Void> {
        service.update(id, dto)
        return ResponseEntity.ok().build()
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long): ResponseEntity<Void> {
        service.delete(id)
        return ResponseEntity.ok().build()
    }
}