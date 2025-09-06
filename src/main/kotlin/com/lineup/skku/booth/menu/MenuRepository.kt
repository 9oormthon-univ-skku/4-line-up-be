package com.lineup.skku.booth.menu

import com.lineup.skku.booth.booth.BoothExceptionCode
import com.lineup.skku.common.CodeException
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional
import java.util.*

@Transactional(readOnly = true)
fun MenuRepository.findByIdAndStoreIdOrThrow(id: Long, storeId: Long): Menu = findByIdAndStore_Id(id, storeId).orElseThrow {
    throw CodeException(BoothExceptionCode.MENU_NOT_FOUND)
}

@Repository
@Transactional
interface MenuRepository: JpaRepository<Menu, Long> {
    @Transactional(readOnly = true)
    fun findAllByStore_Id(storeId: Long): List<Menu>
    @Transactional(readOnly = true)
    fun findByIdAndStore_Id(id: Long, storeId: Long): Optional<Menu>
}