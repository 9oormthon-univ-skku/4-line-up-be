package com.lineup.skku.booth.booth

import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.lineup.skku.booth.booth.entity.GateType
import com.lineup.skku.common.Hour
import com.lineup.skku.common.Link
import com.lineup.skku.common.Point
import jakarta.validation.constraints.Size
import java.time.LocalTime

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "dtype"
)
@JsonSubTypes(value = [
    JsonSubTypes.Type(value = BoothUpdateDto::class, name = "booth"),
    JsonSubTypes.Type(value = GateUpdateDto::class, name = "gate"),
    JsonSubTypes.Type(value = StopUpdateDto::class, name = "stop"),
    JsonSubTypes.Type(value = StoreUpdateDto::class, name = "store")
])
open class BoothUpdateDto(
    @field:Size(min = 1, max = 31, message = "이름은 최소 1글자, 최대 31글자 입니다.")
    open val name: String?,

    @field:Size(min = 1, max = 31, message = "요약은 최소 1글자, 최대 31글자 입니다.")
    open val summary: String?,

    open val description: String?,
    open val point: Point?,
    open val hour: Hour?,

    @field:Size(min = 1, message = "최소 하나 이상의 이미지를 포함해주세요.")
    open val images: List<String>?,

    open val links: List<Link>?
)

data class GateUpdateDto(
    override val name: String?,
    override val summary: String?,
    override val description: String?,
    override val point: Point?,
    override val hour: Hour?,
    override val images: List<String>?,
    override val links: List<Link>?,
    val type: GateType?
) : BoothUpdateDto(name, summary, description, point, hour, images, links)

data class StopUpdateDto(
    override val name: String?,
    override val summary: String?,
    override val description: String?,
    override val point: Point?,
    override val hour: Hour?,
    override val images: List<String>?,
    override val links: List<Link>?,
    @field:Size(min = 1, message = "최소 하나 이상의 배차 시간을 포함해주세요.")
    val times: List<LocalTime>?
) : BoothUpdateDto(name, summary, description, point, hour, images, links)

data class StoreUpdateDto(
    override val name: String?,
    override val summary: String?,
    override val description: String?,
    override val point: Point?,
    override val hour: Hour?,
    override val images: List<String>?,
    override val links: List<Link>?
) : BoothUpdateDto(name, summary, description, point, hour, images, links)
