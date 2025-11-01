package com.lineup.skku.booth.menu

import com.lineup.skku.booth.booth.Booth
import com.lineup.skku.booth.booth.BoothExceptionCode
import com.lineup.skku.booth.booth.BoothSummary
import com.lineup.skku.booth.booth.entity.BoothEntity
import com.lineup.skku.booth.booth.entity.BoothRepository
import com.lineup.skku.booth.booth.entity.BoothType
import com.lineup.skku.common.CodeException
import com.lineup.skku.common.redis.CacheTemplate
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class MenuService (
    private val menuRepository : MenuRepository,
    private val cacheTemplate: CacheTemplate
){
    @Transactional(readOnly = true)
    fun findAllByStoreId(storeId: Long): List<Menu> {
        return cacheTemplate.findCache("booths/$storeId/menus",
            {
                menuRepository.findAllByStoreId(storeId).map {
                    Menu(
                        it.id,
                        it.image,
                        it.name,
                        it.price
                    ) }
            }, CodeException(MenuExceptionCode.NOT_FOUND))
    }

    @Transactional
    fun add(store: Booth, request: MenuCreateRequest): Menu {
        if (store.dtype != BoothType.STORE) throw CodeException(BoothExceptionCode.INVALID_BOOTH)
        val menu = MenuEntity(store.id, request.image, request.name, request.price)
        menuRepository.save(menu)
        cacheTemplate.removeCache("booths/${store.id}/menus")

        return Menu(
            menu.id,
            menu.image,
            menu.name,
            menu.price
        )
    }

    @Transactional
    fun update(store: Booth, menuId: Long, request: MenuUpdateRequest) {
        if (store.dtype != BoothType.STORE) throw CodeException(BoothExceptionCode.INVALID_BOOTH)
        val menu = menuRepository.findByIdAndStoreId(menuId, store.id) ?: throw CodeException(MenuExceptionCode.NOT_FOUND)
        menu.update(request)
        menuRepository.save(menu)
        cacheTemplate.removeCache("booths/${store.id}/menus")
    }

    @Transactional
    fun delete(store: Booth, menuId: Long) {
        if (store.dtype != BoothType.STORE) throw CodeException(BoothExceptionCode.INVALID_BOOTH)
        val menu = menuRepository.findByIdAndStoreId(menuId, store.id) ?: throw CodeException(MenuExceptionCode.NOT_FOUND)
        menuRepository.delete(menu)
        cacheTemplate.removeCache("booths/${store.id}/menus")
    }
}