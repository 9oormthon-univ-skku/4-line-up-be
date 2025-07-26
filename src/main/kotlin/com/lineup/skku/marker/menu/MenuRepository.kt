package com.lineup.skku.marker.menu

import com.lineup.skku.common.CodeException
import com.lineup.skku.marker.marker.MarkerExceptionCode
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional
import java.util.*

fun MenuRepository.findByIdAndStoreIdOrThrow(id: Long, storeId: Long): Menu = findByIdAndStore_Id(id, storeId).orElseThrow({
    throw CodeException(MarkerExceptionCode.MENU_NOT_FOUND)
})

@Repository
@Transactional(readOnly = true)
interface MenuRepository: JpaRepository<Menu, Long> {
    fun findAllByStore_Id(storeId: Long): List<Menu>
    fun findByIdAndStore_Id(id: Long, storeId: Long): Optional<Menu>
}