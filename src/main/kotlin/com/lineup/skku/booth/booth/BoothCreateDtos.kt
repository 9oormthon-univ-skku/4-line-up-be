package com.lineup.skku.booth.booth

import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.lineup.skku.common.Hour
import com.lineup.skku.common.Link
import com.lineup.skku.common.Point
import com.lineup.skku.booth.booth.entity.GateType
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import java.time.LocalTime

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "dtype"
)
@JsonSubTypes(value = [
    JsonSubTypes.Type(value = BoothCreateDto::class, name = "booth"),
    JsonSubTypes.Type(value = GateCreateDto::class, name = "gate"),
    JsonSubTypes.Type(value = StopCreateDto::class, name = "stop"),
    JsonSubTypes.Type(value = StoreCreateDto::class, name = "store")
])
open class BoothCreateDto(
    open val areaId: Long?,

    @field:NotNull(message = "카테고리를 입력해주세요.")
    open val categoryId: Long,

    @field:NotBlank(message = "이름을 입력해주세요.")
    @field:Size(min = 1, max = 31, message = "이름은 최소 1글자, 최대 31글자 입니다.")
    open val name: String,

    @field:Size(min = 1, max = 31, message = "요약은 최소 1글자, 최대 31글자 입니다.")
    open val summary: String?,

    @field:NotBlank(message = "설명을 입력해주세요.")
    open val description: String,

    @field:NotNull(message = "위치 정보를 입력해주세요.")
    open val point: Point,

    @field:NotNull(message = "운영 시간을 입력해주세요.")
    open val hour: Hour,

    @field:NotNull(message = "이미지 배열을 입력해주세요.")
    @field:Size(min = 1, message = "최소 하나 이상의 이미지를 포함해주세요.")
    open val images: List<String> = emptyList(),

    open val links: List<Link> = emptyList()
)

data class GateCreateDto(
    override val areaId: Long?,
    override val categoryId: Long,
    override val name: String,
    override val summary: String?,
    override val description: String,
    override val point: Point,
    override val hour: Hour,
    override val images: List<String> = emptyList(),
    override val links: List<Link> = emptyList(),
    @field:NotNull(message = "게이트 유형을 입력해주세요.")
    val type: GateType
) : BoothCreateDto(areaId, categoryId, name, summary, description, point, hour, images, links)

data class StopCreateDto(
    override val areaId: Long?,
    override val categoryId: Long,
    override val name: String,
    override val summary: String?,
    override val description: String,
    override val point: Point,
    override val hour: Hour,
    override val images: List<String> = emptyList(),
    override val links: List<Link> = emptyList(),
    @field:NotNull(message = "배차 시간표를 입력해주세요.")
    @field:Size(min = 1, message = "최소 하나 이상의 배차 시간을 포함해주세요.")
    val times: List<LocalTime> = emptyList()
) : BoothCreateDto(areaId, categoryId, name, summary, description, point, hour, images, links)

data class StoreCreateDto(
    override val areaId: Long?,
    override val categoryId: Long,
    override val name: String,
    override val summary: String?,
    override val description: String,
    override val point: Point,
    override val hour: Hour,
    override val images: List<String> = emptyList(),
    override val links: List<Link> = emptyList()
) : BoothCreateDto(areaId, categoryId, name, summary, description, point, hour, images, links)
