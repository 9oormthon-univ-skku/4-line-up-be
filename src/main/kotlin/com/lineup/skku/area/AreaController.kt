package com.lineup.skku.area

import com.lineup.skku.common.toUri
import jakarta.validation.Valid
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RequestMapping("/areas")
@RestController
class AreaController (
    private val service: AreaService,
) {

    @PostMapping
    fun create(@Valid @RequestBody dto: AreaCreateDto): ResponseEntity<Long> {
        val saved = service.create(dto)
        return ResponseEntity.created("/areas/${saved.id}".toUri())
            .body(saved.id)
    }

    @GetMapping
    fun findAll(): ResponseEntity<List<Area>> {
        val result = service.findAll()
        return ResponseEntity.ok(result)
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long): ResponseEntity<Area> {
        val result = service.findById(id)
        return ResponseEntity.ok(result)
    }

    @PatchMapping("/{id}")
    fun update(
        @PathVariable id: Long,
        @RequestBody dto: AreaUpdateDto
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