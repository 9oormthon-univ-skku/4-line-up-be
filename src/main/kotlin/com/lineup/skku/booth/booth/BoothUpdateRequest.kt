package com.lineup.skku.booth.booth

import com.lineup.skku.booth.booth.entity.GateType
import com.lineup.skku.common.Hour
import com.lineup.skku.common.Link
import com.lineup.skku.common.Point
import jakarta.validation.constraints.Size
import org.hibernate.validator.constraints.URL

data class BoothUpdateRequest(
    val areaId: Long?,
    val categoryId: Long?,
    @field:Size(min = 1, max = 31, message = "이름은 최소 1글자, 최대 31글자 입니다.")
    val name: String?,
    @field:Size(min = 1, max = 31, message = "요약은 최소 1글자, 최대 31글자 입니다.")
    val summary: String?,
    val description: String?,
    val point: Point?,
    val hour: Hour?,
    @field:Size(min = 1, message = "최소 하나 이상의 이미지를 포함해주세요.")
    val images: List<String>?,
    val links: List<Link>?,
    val gateType: GateType?
)