package com.lineup.skku.booth.category

import com.lineup.skku.common.BaseEntity
import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "category")
class CategoryEntity (
    name: String,
    icon: String,
    color: String
) : BaseEntity() {
    var name: String = name
        protected set

    var icon: String = icon
        protected set

    var color: String = color
        protected set

    fun update(request: CategoryUpdateRequest) {
        name = request.name ?: name
        icon = request.icon ?: icon
        color = request.color ?: color
    }
}