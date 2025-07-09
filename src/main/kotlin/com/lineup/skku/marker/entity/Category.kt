package com.lineup.skku.marker.entity

import jakarta.persistence.*

@Entity
class Category (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    val id: Long?,

    @Column(nullable = false)
    var name: String,

    @Column(nullable = false)
    var icon: String,

    @Column(nullable = false)
    var color: String,
)