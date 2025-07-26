package com.lineup.skku.marker.menu

import com.lineup.skku.marker.marker.entity.Store
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class MenuService (
    private val repository : MenuRepository,
    private val converter: MenuConverter
){
    @Transactional(readOnly = true)
    fun findAllByStoreId(id: Long): List<Menu> {
        return repository.findAllByStore_Id(id)
    }

    fun add(store: Store, dto: MenuCreateDto): Menu {
        val new = converter.toEntity(store, dto)
        new.store = store
        return repository.save(new)
    }

    fun update(storeId: Long, menuId: Long, dto: MenuUpdateDto) {
        val found = repository.findByIdAndStoreIdOrThrow(menuId, storeId)
        found.update(dto)
        repository.save(found)
    }

    fun delete(storeId: Long, menuId: Long) {
        val found = repository.findByIdAndStoreIdOrThrow(menuId, storeId)
        repository.delete(found)
    }
}