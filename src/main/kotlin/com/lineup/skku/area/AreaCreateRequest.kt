package com.lineup.skku.area

import com.lineup.skku.common.Hour
import com.lineup.skku.common.Point
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size

data class AreaCreateRequest(
    @field:NotBlank(message = "이름을 입력해주세요.")
    @field:Size(min = 1, max = 31, message = "이름은 최소 1글자, 최대 31글자 입니다.")
    val name: String,
    @field:Size(min = 1, max = 31, message = "요약은 최소 1글자, 최대 31글자 입니다.")
    val summary: String?,
    @field:NotNull(message = "위치 정보를 입력해주세요.")
    val point: Point,
    @field:NotNull(message = "운영 시간을 입력해주세요.")
    val hour: Hour
)