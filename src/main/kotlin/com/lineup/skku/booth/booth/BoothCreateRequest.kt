package com.lineup.skku.booth.booth

import com.lineup.skku.booth.booth.entity.BoothType
import com.lineup.skku.booth.booth.entity.GateType
import com.lineup.skku.common.Hour
import com.lineup.skku.common.Link
import com.lineup.skku.common.Point
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size

data class BoothCreateRequest(
    val areaId: Long?,
    @field:NotNull(message = "카테고리를 입력해주세요.")
    val categoryId: Long,
    @field:NotNull(message = "부스 타입을 입력해주세요.")
    val dtype: BoothType,
    @field:NotBlank(message = "이름을 입력해주세요.")
    @field:Size(min = 1, max = 31, message = "이름은 최소 1글자, 최대 31글자 입니다.")
    val name: String,
    @field:Size(min = 1, max = 31, message = "요약은 최소 1글자, 최대 31글자 입니다.")
    val summary: String?,
    @field:NotBlank(message = "설명을 입력해주세요.")
    val description: String,
    @field:NotNull(message = "위치 정보를 입력해주세요.")
    val point: Point,
    @field:NotNull(message = "운영 시간을 입력해주세요.")
    val hour: Hour,
    @field:NotNull(message = "이미지 배열을 입력해주세요.")
    @field:Size(min = 1, message = "최소 하나 이상의 이미지를 포함해주세요.")
    val images: List<String> = emptyList(),
    val links: List<Link> = emptyList(),
    val gateType: GateType?,
)