package com.lineup.skku.marker.marker.entity

import com.lineup.skku.area.Area
import com.lineup.skku.common.BaseEntity
import com.lineup.skku.common.Hour
import com.lineup.skku.common.Link
import com.lineup.skku.common.Point
import com.lineup.skku.marker.category.Category
import jakarta.persistence.*

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
class Marker (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "marker_id")
    val id: Long = 0L,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "area_id")
    var area: Area?,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", nullable = false)
    val category: Category,

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

    @ElementCollection
    @JoinTable(name = "marker_image",
        joinColumns = [JoinColumn(name = "marker_id")])
    @Column(name = "src")
    val images: MutableList<String> = mutableListOf(),

    @ElementCollection
    @JoinTable(name = "marker_link",
        joinColumns = [JoinColumn(name = "marker_id")])
    val links: MutableList<Link> = mutableListOf()
) : BaseEntity()