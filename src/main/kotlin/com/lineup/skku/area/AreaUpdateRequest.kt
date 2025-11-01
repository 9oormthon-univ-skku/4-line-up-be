package com.lineup.skku.area

import com.lineup.skku.common.Hour
import com.lineup.skku.common.Point
import jakarta.validation.constraints.Size

data class AreaUpdateRequest(
    @field:Size(min = 1, max = 31, message = "이름은 최소 1글자, 최대 31글자 입니다.")
    val name: String?,
    @field:Size(min = 1, max = 31, message = "요약은 최소 1글자, 최대 31글자 입니다.")
    val summary: String?,
    val point: Point?,
    val hour: Hour?
)
