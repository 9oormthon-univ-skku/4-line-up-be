package com.lineup.skku.booth.menu

import com.lineup.skku.booth.booth.entity.Store
import org.springframework.stereotype.Component

@Component
class MenuConverter {

    fun toEntity(store: Store, dto: MenuCreateDto): Menu {
        return Menu(
            store,
            dto.image,
            dto.name,
            dto.price
        )
    }

}