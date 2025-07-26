package com.lineup.skku.timetable

import com.lineup.skku.common.CodeException
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

fun TimeslotRepository.findByIdOrThrow(id: Long) = findByIdOrNull(id) ?: throw CodeException(TimeslotExceptionCode.NOT_FOUND)
fun TimeslotRepository.deleteByIdOrThrow(id: Long) = {
    findByIdOrThrow(id)
    deleteById(id)
}

@Repository
@Transactional(readOnly = true)
interface TimeslotRepository: JpaRepository<Timeslot, Long>