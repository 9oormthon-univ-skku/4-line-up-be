package com.lineup.skku.area

import com.lineup.skku.common.BaseEntity
import com.lineup.skku.common.Default
import com.lineup.skku.common.Hour
import com.lineup.skku.common.Link
import com.lineup.skku.common.Point
import jakarta.persistence.*

@Entity
class Area @Default constructor (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "area_id")
    val id: Long = 0L,

    @Column(nullable = false)
    var name: String,

    @Column
    var summary: String?,

    @Column(nullable = false)
    var description: String,

    @Column(nullable = false)
    var hour: Hour,

    @ElementCollection(fetch = FetchType.EAGER)
    @JoinTable(name = "area_image",
        joinColumns = [JoinColumn(name = "area_id")])
    @Column(name = "src")
    val images: MutableList<String> = mutableListOf(),

    @ElementCollection(fetch = FetchType.EAGER)
    @JoinTable(name = "area_point",
        joinColumns = [JoinColumn(name = "area_id")])
    val points: MutableSet<Point> = mutableSetOf(),

    @ElementCollection(fetch = FetchType.EAGER)
    @JoinTable(name = "area_link",
        joinColumns = [JoinColumn(name = "area_id")])
    val links: MutableList<Link> = mutableListOf()
) : BaseEntity()
