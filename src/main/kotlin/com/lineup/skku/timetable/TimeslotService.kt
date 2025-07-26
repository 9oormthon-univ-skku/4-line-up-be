package com.lineup.skku.timetable

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class TimeslotService (
    private val repository : TimeslotRepository,
    private val converter: TimeslotConverter
){
    @Transactional(readOnly = true)
    fun findAll(): List<Timeslot> {
        return repository.findAll()
    }

    fun create(dto: TimeslotCreateDto): Timeslot {
        val new = converter.toEntity(dto)
        return repository.save(new)
    }

    fun delete(id: Long) {
        repository.deleteByIdOrThrow(id)
    }
}