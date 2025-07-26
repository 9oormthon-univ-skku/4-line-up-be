package com.lineup.skku.marker.category

import com.lineup.skku.common.BaseEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity

@Entity
class Category (
    id: Long = 0L,

    @Column(nullable = false)
    var name: String,

    @Column(nullable = false)
    var icon: String,

    @Column(nullable = false)
    var color: String,
) : BaseEntity(id) {
    fun update(dto: CategoryUpdateDto) {
        name = dto.name ?: name
        icon = dto.icon ?: icon
        color = dto.color ?: color
    }
}