package com.lineup.skku.booth.booth

import com.lineup.skku.area.AreaService
import com.lineup.skku.booth.category.CategoryService
import com.lineup.skku.common.toUri
import jakarta.validation.Valid
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RequestMapping("/booths")
@RestController
class BoothController (
    private val boothService: BoothService,
    private val areaService: AreaService,
    private val categoryService: CategoryService
) {
    @PostMapping
    fun create(@Valid @RequestBody request: BoothCreateRequest): ResponseEntity<Long> {
        categoryService.findById(request.categoryId)
        if (request.areaId != null) areaService.findById(request.areaId)
        val result = boothService.create(request)
        return ResponseEntity.created("/booths/${result.id}".toUri())
            .body(result.id)
    }

    @GetMapping
    fun findAll(): ResponseEntity<List<BoothSummary>> {
        val result = boothService.findAll()
        return ResponseEntity.ok(result)
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long): ResponseEntity<Booth> {
        val result = boothService.findById(id)
        return ResponseEntity.ok(result)
    }

    @PatchMapping("/{id}")
    fun update(
        @PathVariable id: Long,
        @RequestBody request: BoothUpdateRequest
    ): ResponseEntity<Void> {
        boothService.update(id, request)
        return ResponseEntity.ok().build()
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long): ResponseEntity<Void> {
        boothService.delete(id)
        return ResponseEntity.ok().build()
    }
}