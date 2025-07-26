package com.lineup.skku.marker.menu

import com.lineup.skku.common.BaseEntity
import com.lineup.skku.marker.marker.entity.Store
import jakarta.persistence.*

@Entity
class Menu (
    id: Long = 0L,

    @ManyToOne
    @JoinColumn(name = "store_id", nullable = false)
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