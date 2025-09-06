package com.lineup.skku.booth.category

import com.lineup.skku.common.CodeException
import com.lineup.skku.booth.booth.BoothExceptionCode
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

@Transactional(readOnly = true)
fun CategoryRepository.findByIdOrThrow(id: Long) = findByIdOrNull(id) ?: throw CodeException(BoothExceptionCode.CATEGORY_NOT_FOUND)
fun CategoryRepository.deleteByIdOrThrow(id: Long) {
    findByIdOrThrow(id)
    deleteById(id)
}

@Repository
@Transactional
interface CategoryRepository: JpaRepository<Category, Long>