package com.lineup.skku.booth.menu

import com.fasterxml.jackson.annotation.JsonIgnore
import com.lineup.skku.booth.booth.entity.Store
import com.lineup.skku.common.BaseEntity
import jakarta.persistence.*

@Entity
class Menu (
    id: Long = 0L,

    @ManyToOne
    @JoinColumn(name = "store_id", nullable = false)
    @JsonIgnore
    var store: Store,

    @Column(nullable = false)
    var image: String,

    @Column(nullable = false)
    var name: String,

    @Column(nullable = false)
    var price: Long
) : BaseEntity(id) {

    fun update(dto: MenuUpdateDto) {
        image = dto.image ?: image
        name = dto.name ?: name
        price = dto.price ?: price
    }

}