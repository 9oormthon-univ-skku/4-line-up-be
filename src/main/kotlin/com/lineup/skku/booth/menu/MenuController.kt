package com.lineup.skku.booth.menu

import com.lineup.skku.booth.booth.BoothExceptionCode
import com.lineup.skku.booth.booth.BoothService
import com.lineup.skku.booth.booth.entity.BoothType
import com.lineup.skku.common.CodeException
import com.lineup.skku.common.toUri
import jakarta.validation.Valid
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RequestMapping("/booths")
@RestController
class MenuController (
    private val boothService: BoothService,
    private val menuService: MenuService,
) {
    @GetMapping("/{storeId}/menus")
    fun findAllMenu(@PathVariable storeId: Long): ResponseEntity<List<Menu>> {
        val result = menuService.findAllByStoreId(storeId)
        return ResponseEntity.ok(result)
    }

    @PostMapping("/{storeId}/menus")
    fun createMenu(@PathVariable storeId: Long,
                   @Valid @RequestBody request: MenuCreateRequest): ResponseEntity<Long> {
        val store = boothService.findById(storeId)
        val result = menuService.add(store, request)
        return ResponseEntity.created("/booths/${storeId}/menus".toUri())
            .body(result.id)
    }

    @PatchMapping("/{storeId}/menus/{menuId}")
    fun update(
        @PathVariable storeId: Long,
        @PathVariable menuId: Long,
        @RequestBody request: MenuUpdateRequest
    ): ResponseEntity<Void> {
        val store = boothService.findById(storeId)
        menuService.update(store, menuId, request)
        return ResponseEntity.ok().build()
    }

    @DeleteMapping("/{storeId}/menus/{menuId}")
    fun deleteMenu(@PathVariable storeId: Long,
                   @PathVariable menuId: Long): ResponseEntity<Long> {
        val store = boothService.findById(storeId)
        menuService.delete(store, menuId)
        return ResponseEntity.ok().build()
    }
}