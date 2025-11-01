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
    fun create(@Valid @RequestBody request: PostCreateRequest): ResponseEntity<Long> {
        val result = service.create(request)
        return ResponseEntity.created("/posts/${result.id}".toUri())
            .body(result.id)
    }

    @GetMapping
    fun findAll(): ResponseEntity<List<PostSummary>> {
        val result = service.findAll()
        return ResponseEntity.ok(result)
    }

    @PatchMapping("/{id}")
    fun update(
        @PathVariable id: Long,
        @RequestBody request: PostUpdateRequest
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