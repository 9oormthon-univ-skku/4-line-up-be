package com.lineup.skku.marker.marker

import com.lineup.skku.common.CodeException
import com.lineup.skku.marker.marker.entity.Marker
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

fun MarkerRepository.findByIdOrThrow(id: Long) = findByIdOrNull(id) ?: throw CodeException(MarkerExceptionCode.NOT_FOUND)
fun MarkerRepository.deleteByIdOrThrow(id: Long) = {
    findByIdOrThrow(id)
    deleteById(id)
}

@Repository
@Transactional(readOnly = true)
interface MarkerRepository: JpaRepository<Marker, Long>