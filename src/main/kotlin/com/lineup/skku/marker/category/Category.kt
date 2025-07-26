package com.lineup.skku.marker.category

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class Category (
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
) {
    fun update(dto: CategoryUpdateDto) {
        name = dto.name ?: name
        icon = dto.icon ?: icon
        color = dto.color ?: color
    }
}