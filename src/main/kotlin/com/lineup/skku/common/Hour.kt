package com.lineup.skku.common

import jakarta.persistence.Embeddable
import jakarta.validation.constraints.NotNull
import java.time.LocalTime

@Embeddable
data class Hour(
    @field:NotNull(message = "오픈 시간을 입력해주세요.")
    val open: LocalTime,
    @field:NotNull(message = "마감 시간을 입력해주세요.")
    val close: LocalTime
)
