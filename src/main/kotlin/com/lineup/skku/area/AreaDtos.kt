package com.lineup.skku.area

import com.lineup.skku.common.Hour
import com.lineup.skku.common.Link
import com.lineup.skku.common.Point
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size

data class AreaCreateDto(
    @field:NotBlank(message = "이름을 입력해주세요.")
    @field:Size(min = 1, max = 31, message = "이름은 최소 1글자, 최대 31글자 입니다.")
    val name: String,

    @field:Size(min = 1, max = 31, message = "요약은 최소 1글자, 최대 31글자 입니다.")
    val summary: String?,

    @field:NotBlank(message = "설명을 입력해주세요.")
    val description: String,

    @field:NotNull(message = "운영 시간을 입력해주세요.")
    val hour: Hour,

    @field:NotNull(message = "이미지 배열을 입력해주세요.")
    @field:Size(min = 1, message = "최소 하나 이상의 이미지를 포함해주세요.")
    val images: List<String> = emptyList(),

    @field:NotNull(message = "위치 정보 배열을 입력해주세요.")
    @field:Size(min = 3, message = "최소 셋 이상의 위치 정보를 포함해주세요.")
    val points: Set<Point> = emptySet(),

    val links: List<Link>
)

data class AreaUpdateDto(
    @field:Size(min = 1, max = 31, message = "이름은 최소 1글자, 최대 31글자 입니다.")
    val name: String,

    @field:Size(min = 1, max = 31, message = "요약은 최소 1글자, 최대 31글자 입니다.")
    val summary: String?,

    val description: String,

    val hour: Hour,

    @field:Size(min = 1, message = "최소 하나 이상의 이미지를 포함해주세요.")
    val images: List<String> = emptyList(),

    @field:Size(min = 3, message = "최소 셋 이상의 위치 정보를 포함해주세요.")
    val points: Set<Point> = emptySet(),

    val links: List<Link>
)
