package com.lineup.skku.booth.category

import com.lineup.skku.common.BaseEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity

@Entity
class Category (
    @Column(nullable = false)
    var name: String,

    @Column(nullable = false)
    var icon: String,

    @Column(nullable = false)
    var color: String,
) : BaseEntity() {
    fun update(dto: CategoryUpdateDto) {
        name = dto.name ?: name
        icon = dto.icon ?: icon
        color = dto.color ?: color
    }
}