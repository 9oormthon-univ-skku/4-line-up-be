package com.lineup.skku.common

import jakarta.persistence.Embeddable
import jakarta.validation.constraints.NotNull

@Embeddable
data class Point(
    @field:NotNull(message = "x 좌표를 입력해주세요.")
    val x: Int,
    @field:NotNull(message = "y 좌표를 입력해주세요.")
    val y: Int
)
