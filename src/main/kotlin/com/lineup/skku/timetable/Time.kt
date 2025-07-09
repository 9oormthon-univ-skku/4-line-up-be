package com.lineup.skku.timetable

import com.lineup.skku.common.BaseEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.time.LocalDateTime

@Entity
class Time (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "time_id")
    val id: Long?,

    @Column(nullable = false)
    var name: String,

    @Column(nullable = false)
    var start: LocalDateTime,

    @Column(nullable = false)
    var end: LocalDateTime,

    var href: String?

) : BaseEntity()