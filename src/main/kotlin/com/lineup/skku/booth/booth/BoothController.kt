package com.lineup.skku.booth.booth

import com.lineup.skku.area.AreaService
import com.lineup.skku.booth.booth.entity.Booth
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
    fun create(@Valid @RequestBody dto: BoothCreateDto): ResponseEntity<Long> {
        val foundCategory = categoryService.findById(dto.categoryId)
        val foundArea = if (dto.areaId == null) null else areaService.findById(dto.areaId!!)
        val savedBooth = boothService.create(dto, foundArea, foundCategory)
        return ResponseEntity.created("/booths/${savedBooth.id}".toUri())
            .body(savedBooth.id)
    }

    @GetMapping
    fun findAll(): ResponseEntity<List<Booth>> {
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
        @RequestBody dto: BoothUpdateDto
    ): ResponseEntity<Void> {
        boothService.update(id, dto)
        return ResponseEntity.ok().build()
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long): ResponseEntity<Void> {
        boothService.delete(id)
        return ResponseEntity.ok().build()
    }

    @PutMapping("/{boothId}/category")
    fun updateCategory(
        @PathVariable boothId: Long,
        @RequestBody categoryId: Long
    ): ResponseEntity<Void> {
        val foundCategory = categoryService.findById(categoryId)
        val foundBooth = boothService.findById(boothId)
        boothService.updateCategory(foundBooth, foundCategory)
        return ResponseEntity.ok().build()
    }

    @PutMapping("/{boothId}/area")
    fun updateArea(
        @PathVariable boothId: Long,
        @RequestBody areaId: Long
    ): ResponseEntity<Void> {
        val foundArea = areaService.findById(areaId)
        val foundBooth = boothService.findById(boothId)
        boothService.updateArea(foundBooth, foundArea)
        return ResponseEntity.ok().build()
    }

    @DeleteMapping("/{boothId}/area")
    fun deleteArea(@PathVariable boothId: Long): ResponseEntity<Void> {
        val foundBooth = boothService.findById(boothId)
        boothService.updateArea(foundBooth, null)
        return ResponseEntity.ok().build()
    }
}