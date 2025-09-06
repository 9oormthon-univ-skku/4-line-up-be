package com.lineup.skku.area

import com.lineup.skku.common.CodeException
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

@Transactional(readOnly = true)
fun AreaRepository.findByIdOrThrow(id: Long) = findByIdOrNull(id) ?: throw CodeException(AreaExceptionCode.NOT_FOUND)

@Repository
@Transactional
interface AreaRepository: JpaRepository<Area, Long>