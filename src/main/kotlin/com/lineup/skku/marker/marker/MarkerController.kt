package com.lineup.skku.marker.marker

import com.lineup.skku.area.AreaService
import com.lineup.skku.common.toUri
import com.lineup.skku.marker.category.CategoryService
import com.lineup.skku.marker.marker.entity.Marker
import jakarta.validation.Valid
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RequestMapping("/markers")
@RestController
class MarkerController (
    private val markerService: MarkerService,
    private val areaService: AreaService,
    private val categoryService: CategoryService
) {
    @PostMapping
    fun create(@Valid @RequestBody dto: MarkerCreateDto): ResponseEntity<Long> {
        val foundCategory = categoryService.findById(dto.categoryId)
        val foundArea = if(dto.areaId == null) null else areaService.findById(dto.areaId!!)
        val savedMarker = markerService.create(dto, foundArea, foundCategory)
        return ResponseEntity.created("/markers/${savedMarker.id}".toUri())
            .body(savedMarker.id)
    }

    @GetMapping
    fun findAll(): ResponseEntity<List<Marker>> {
        val result = markerService.findAll()
        return ResponseEntity.ok(result)
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long): ResponseEntity<Marker> {
        val result = markerService.findById(id)
        return ResponseEntity.ok(result)
    }

    @PatchMapping("/{id}")
    fun update(
        @PathVariable id: Long,
        @RequestBody dto: MarkerUpdateDto
    ): ResponseEntity<Void> {
        markerService.update(id, dto)
        return ResponseEntity.ok().build()
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long): ResponseEntity<Void> {
        markerService.delete(id)
        return ResponseEntity.ok().build()
    }

    @PutMapping("/{markerId}/category")
    fun updateCategory(
        @PathVariable markerId: Long,
        @RequestBody categoryId: Long
    ): ResponseEntity<Void> {
        val foundCategory = categoryService.findById(categoryId)
        val foundMarker = markerService.findById(markerId)
        markerService.updateCategory(foundMarker, foundCategory)
        return ResponseEntity.ok().build()
    }

    @PutMapping("/{markerId}/area")
    fun updateArea(
        @PathVariable markerId: Long,
        @RequestBody areaId: Long
    ): ResponseEntity<Void> {
        val foundArea = areaService.findById(areaId)
        val foundMarker = markerService.findById(markerId)
        markerService.updateArea(foundMarker, foundArea)
        return ResponseEntity.ok().build()
    }

    @DeleteMapping("/{markerId}/area")
    fun deleteArea(@PathVariable markerId: Long): ResponseEntity<Void> {
        val foundMarker = markerService.findById(markerId)
        markerService.updateArea(foundMarker, null)
        return ResponseEntity.ok().build()
    }
}