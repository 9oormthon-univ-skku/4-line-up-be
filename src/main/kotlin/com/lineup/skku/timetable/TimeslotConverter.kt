package com.lineup.skku.timetable

import org.springframework.stereotype.Component

@Component
class TimeslotConverter {

    fun toEntity(dto: TimeslotCreateDto): Timeslot {
        return Timeslot(
            dto.name,
            dto.startTime,
            dto.endTime,
            dto.href
        )
    }

}