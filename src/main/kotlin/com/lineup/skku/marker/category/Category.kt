package com.lineup.skku.marker.category

import com.lineup.skku.common.Default
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class Category @Default constructor (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    val id: Long = 0L,

    @Column(nullable = false)
    var name: String,

    @Column(nullable = false)
    var icon: String,

    @Column(nullable = false)
    var color: String,
)