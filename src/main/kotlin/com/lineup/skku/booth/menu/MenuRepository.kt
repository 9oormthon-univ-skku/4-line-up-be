package com.lineup.skku.booth.menu

import org.springframework.data.jpa.repository.JpaRepository

interface MenuRepository: JpaRepository<MenuEntity, Long> {
    fun findAllByStoreId(storeId: Long): List<MenuEntity>
    fun findByIdAndStoreId(id: Long, storeId: Long): MenuEntity?
}