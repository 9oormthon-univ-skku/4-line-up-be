package com.lineup.skku.booth.booth.entity

import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.lineup.skku.area.Area
import com.lineup.skku.common.BaseEntity
import com.lineup.skku.common.Hour
import com.lineup.skku.common.Link
import com.lineup.skku.common.Point
import com.lineup.skku.booth.category.Category
import com.lineup.skku.booth.booth.BoothUpdateDto
import jakarta.persistence.*

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "dtype"
)
@JsonSubTypes(value = [
    JsonSubTypes.Type(value = Booth::class, name = "booth"),
    JsonSubTypes.Type(value = Gate::class, name = "gate"),
    JsonSubTypes.Type(value = Stop::class, name = "stop"),
    JsonSubTypes.Type(value = Store::class, name = "store")
])
class Booth (
    id: Long = 0L,

    @ManyToOne
    @JoinColumn(name = "area_id")
    var area: Area?,

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    var category: Category,

    @Column(nullable = false)
    var name: String,

    @Column
    var summary: String?,

    @Column(nullable = false)
    var description: String,

    @Column(nullable = false)
    var point: Point,

    @Column(nullable = false)
    var hour: Hour,

    @ElementCollection(fetch = FetchType.EAGER)
    @JoinTable(name = "booth_image",
        joinColumns = [JoinColumn(name = "booth_id")])
    @Column(name = "src")
    val images: MutableList<String> = mutableListOf(),

    @ElementCollection(fetch = FetchType.EAGER)
    @JoinTable(name = "booth_link",
        joinColumns = [JoinColumn(name = "booth_id")])
    val links: MutableList<Link> = mutableListOf()

) : BaseEntity(id) {

    fun update(dto: BoothUpdateDto) {
        name = dto.name ?: name
        summary = dto.summary ?: summary
        description = dto.description ?: description
        point = dto.point ?: point
        hour = dto.hour ?: hour
        if (dto.images != null) {
            images.clear()
            images.addAll(dto.images!!)
        }
        if (dto.links != null) {
            links.clear()
            links.addAll(dto.links!!)
        }
    }

}