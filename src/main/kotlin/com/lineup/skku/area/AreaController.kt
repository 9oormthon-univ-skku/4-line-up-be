package com.lineup.skku.area

import com.lineup.skku.common.toUri
import jakarta.validation.Valid
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RequestMapping("/areas")
@RestController
class AreaController (
    private val areaService: AreaService,
) {

    @PostMapping
    fun create(@Valid @RequestBody request: AreaCreateRequest): ResponseEntity<Long> {
        val result = areaService.create(request)
        return ResponseEntity.created("/areas/${result.id}".toUri())
            .body(result.id)
    }

    @GetMapping
    fun findAll(): ResponseEntity<List<Area>> {
        val result = areaService.findAll()
        return ResponseEntity.ok(result)
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long): ResponseEntity<Area> {
        val result = areaService.findById(id)
        return ResponseEntity.ok(result)
    }

    @PatchMapping("/{id}")
    fun update(
        @PathVariable id: Long,
        @RequestBody request: AreaUpdateRequest
    ): ResponseEntity<Void> {
        areaService.update(id, request)
        return ResponseEntity.ok().build()
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long): ResponseEntity<Void> {
        areaService.delete(id)
        return ResponseEntity.ok().build()
    }
}