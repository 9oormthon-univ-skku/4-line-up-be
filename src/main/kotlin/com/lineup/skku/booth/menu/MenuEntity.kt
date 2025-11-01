package com.lineup.skku.booth.menu

import com.lineup.skku.common.BaseEntity
import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "menu")
class MenuEntity (
    val storeId: Long,
    image: String,
    name: String,
    price: Long
) : BaseEntity() {
    var image: String = image
        protected set

    var name: String = name
        protected set

    var price: Long = price
        protected set

    fun update(request: MenuUpdateRequest) {
        image = request.image ?: image
        name = request.name ?: name
        price = request.price ?: price
    }
}