package com.lineup.skku.booth.booth

import com.lineup.skku.booth.menu.MenuEntity
import com.lineup.skku.common.Hour
import com.lineup.skku.common.Link
import com.lineup.skku.common.Point

data class Store (
    val id: Long,
    val categoryId: Long,
    val name: String,
    val summary: String?,
    val description: String,
    val point: Point,
    val hour: Hour,
    val images: List<String>,
    val links: List<Link>,
    val menuEntities: List<MenuEntity>
)