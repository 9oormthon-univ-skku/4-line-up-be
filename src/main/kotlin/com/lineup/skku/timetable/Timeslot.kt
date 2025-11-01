package com.lineup.skku.timetable

import com.lineup.skku.common.BaseEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity
import java.time.LocalDateTime

@Entity
class Timeslot (
    @Column(nullable = false)
    var name: String,

    @Column(nullable = false)
    var startTime: LocalDateTime,

    @Column(nullable = false)
    var endTime: LocalDateTime,

    var href: String?

) : BaseEntity()