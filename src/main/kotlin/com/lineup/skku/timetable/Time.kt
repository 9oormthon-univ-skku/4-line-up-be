package com.lineup.skku.timetable

import com.lineup.skku.common.BaseEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity
import java.time.LocalDateTime

@Entity
class Time (
    id: Long = 0L,

    @Column(nullable = false)
    var name: String,

    @Column(nullable = false)
    var start: LocalDateTime,

    @Column(nullable = false)
    var end: LocalDateTime,

    var href: String?

) : BaseEntity(id)