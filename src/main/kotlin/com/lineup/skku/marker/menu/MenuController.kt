package com.lineup.skku.marker.menu

import com.lineup.skku.common.CodeException
import com.lineup.skku.common.toUri
import com.lineup.skku.marker.marker.MarkerExceptionCode
import com.lineup.skku.marker.marker.MarkerService
import com.lineup.skku.marker.marker.entity.Store
import jakarta.validation.Valid
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RequestMapping("/stores")
@RestController
class MenuController (
    private val markerService: MarkerService,
    private val menuService: MenuService,
) {
    @GetMapping("/{storeId}/menus")
    fun findAllMenu(@PathVariable storeId: Long): ResponseEntity<List<Menu>> {
        val result = menuService.findAllByStoreId(storeId)
        return ResponseEntity.ok(result)
    }

    @PostMapping("/{storeId}/menus")
    fun createMenu(@PathVariable storeId: Long,
                   @Valid @RequestBody dto: MenuCreateDto): ResponseEntity<Long> {
        val foundStore = markerService.findById(storeId)
        if (foundStore !is Store)
            throw CodeException(MarkerExceptionCode.NOT_VALID)

        val savedMenu = menuService.add(foundStore, dto)
        return ResponseEntity.created("/stores/${storeId}/menus".toUri())
            .body(savedMenu.id)
    }

    @PatchMapping("/{storeId}/menus/{menuId}")
    fun update(
        @PathVariable storeId: Long,
        @PathVariable menuId: Long,
        @RequestBody dto: MenuUpdateDto
    ): ResponseEntity<Void> {
        menuService.update(storeId, menuId, dto)
        return ResponseEntity.ok().build()
    }

    @DeleteMapping("/{storeId}/menus/{menuId}")
    fun deleteMenu(@PathVariable storeId: Long,
                   @PathVariable menuId: Long): ResponseEntity<Long> {
        menuService.delete(storeId, menuId)
        return ResponseEntity.ok().build()
    }
}