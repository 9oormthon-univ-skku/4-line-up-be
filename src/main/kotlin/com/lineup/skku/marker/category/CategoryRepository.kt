package com.lineup.skku.marker.category

import com.lineup.skku.common.CodeException
import com.lineup.skku.marker.marker.MarkerExceptionCode
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

fun CategoryRepository.findByIdOrThrow(id: Long) = findByIdOrNull(id) ?: throw CodeException(MarkerExceptionCode.CATEGORY_NOT_FOUND)
fun CategoryRepository.deleteByIdOrThrow(id: Long) = {
    findByIdOrThrow(id)
    deleteById(id)
}

@Repository
@Transactional(readOnly = true)
interface CategoryRepository: JpaRepository<Category, Long>