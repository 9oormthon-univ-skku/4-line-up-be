package com.lineup.skku.common

import jakarta.persistence.Embeddable
import java.time.LocalTime

@Embeddable
data class Hour(
    val open: LocalTime,
    val close: LocalTime
)
