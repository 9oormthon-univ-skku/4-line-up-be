package com.lineup.skku.marker.marker.entity

import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.lineup.skku.area.Area
import com.lineup.skku.common.*
import com.lineup.skku.marker.category.Category
import jakarta.persistence.*

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "dtype"
)
@JsonSubTypes(value = [
    JsonSubTypes.Type(value = Marker::class, name = "marker"),
    JsonSubTypes.Type(value = Gate::class, name = "gate"),
    JsonSubTypes.Type(value = Stop::class, name = "stop"),
    JsonSubTypes.Type(value = Store::class, name = "store")
])
class Marker @Default constructor (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "marker_id")
    val id: Long = 0L,

    @ManyToOne
    @JoinColumn(name = "area_id")
    var area: Area?,

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    var category: Category?,

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
    @JoinTable(name = "marker_image",
        joinColumns = [JoinColumn(name = "marker_id")])
    @Column(name = "src")
    val images: MutableList<String> = mutableListOf(),

    @ElementCollection(fetch = FetchType.EAGER)
    @JoinTable(name = "marker_link",
        joinColumns = [JoinColumn(name = "marker_id")])
    val links: MutableList<Link> = mutableListOf()
) : BaseEntity()