package com.lineup.skku.marker.menu

import com.lineup.skku.marker.marker.entity.Store
import org.springframework.stereotype.Component

@Component
class MenuConverter {

    fun toEntity(store: Store, dto: MenuCreateDto): Menu {
        return Menu(
            0L,
            store,
            dto.image,
            dto.name,
            dto.price
        )
    }

}