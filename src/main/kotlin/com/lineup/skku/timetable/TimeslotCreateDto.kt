package com.lineup.skku.timetable

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import java.time.LocalDateTime

data class TimeslotCreateDto(
    @field:NotBlank(message = "제목을 입력해주세요.")
    @field:Size(min = 1, max = 31, message = "제목은 최소 1글자, 최대 31글자 입니다.")
    val name: String,
    @field:NotNull(message = "시작 시간을 입력해주세요.")
    val startTime: LocalDateTime,
    @field:NotNull(message = "종료 시간을 입력해주세요.")
    val endTime: LocalDateTime,
    val href: String?
)