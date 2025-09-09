package com.lineup.skku.booth.booth

import com.lineup.skku.common.CodeException
import com.lineup.skku.booth.booth.entity.Booth
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

@Transactional(readOnly = true)
fun BoothRepository.findByIdOrThrow(id: Long) = findByIdOrNull(id) ?: throw CodeException(BoothExceptionCode.NOT_FOUND)
fun BoothRepository.deleteByIdOrThrow(id: Long) {
    findByIdOrThrow(id)
    deleteById(id)
}

@Repository
@Transactional
interface BoothRepository: JpaRepository<Booth, Long> {
    fun findAllByAreaId(areaId: Long): List<Booth>
    fun findAllByCategory_Id(categoryId: Long): List<Booth>
}