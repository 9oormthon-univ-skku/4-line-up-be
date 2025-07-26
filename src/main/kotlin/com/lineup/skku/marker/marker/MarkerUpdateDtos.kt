package com.lineup.skku.marker.marker

import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.lineup.skku.common.Hour
import com.lineup.skku.common.Link
import com.lineup.skku.common.Point
import com.lineup.skku.marker.marker.entity.GateType
import jakarta.validation.constraints.Size
import java.time.LocalTime

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "dtype"
)
@JsonSubTypes(value = [
    JsonSubTypes.Type(value = MarkerUpdateDto::class, name = "marker"),
    JsonSubTypes.Type(value = GateUpdateDto::class, name = "gate"),
    JsonSubTypes.Type(value = StopUpdateDto::class, name = "stop"),
    JsonSubTypes.Type(value = StoreUpdateDto::class, name = "store")
])
open class MarkerUpdateDto(
    @field:Size(min = 1, max = 31, message = "이름은 최소 1글자, 최대 31글자 입니다.")
    open var name: String?,

    @field:Size(min = 1, max = 31, message = "요약은 최소 1글자, 최대 31글자 입니다.")
    open var summary: String?,

    open var description: String?,
    open var point: Point?,
    open var hour: Hour?,

    @field:Size(min = 1, message = "최소 하나 이상의 이미지를 포함해주세요.")
    open val images: List<String> = emptyList(),

    open val links: List<Link> = emptyList()
)

data class GateUpdateDto(
    override var name: String?,
    override var summary: String?,
    override var description: String?,
    override var point: Point?,
    override var hour: Hour?,
    override val images: List<String> = emptyList(),
    override val links: List<Link> = emptyList(),
    val type: GateType
) : MarkerUpdateDto(name, summary, description, point, hour, images, links)

data class StopUpdateDto(
    override var name: String?,
    override var summary: String?,
    override var description: String?,
    override var point: Point?,
    override var hour: Hour?,
    override val images: List<String> = emptyList(),
    override val links: List<Link> = emptyList(),
    @field:Size(min = 1, message = "최소 하나 이상의 배차 시간을 포함해주세요.")
    val times: List<LocalTime> = emptyList()
) : MarkerUpdateDto(name, summary, description, point, hour, images, links)

data class StoreUpdateDto(
    override var name: String?,
    override var summary: String?,
    override var description: String?,
    override var point: Point?,
    override var hour: Hour?,
    override val images: List<String> = emptyList(),
    override val links: List<Link> = emptyList()
) : MarkerUpdateDto(name, summary, description, point, hour, images, links)
