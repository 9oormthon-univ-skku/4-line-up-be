package com.lineup.skku.marker

import com.lineup.skku.marker.entity.Menu
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

@Repository
@Transactional(readOnly = true)
interface MenuRepository: JpaRepository<Menu, Long> {
    fun findAllByStore_Id(storeId: Long): List<Menu>
}