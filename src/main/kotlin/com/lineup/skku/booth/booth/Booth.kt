package com.lineup.skku.booth.booth

import com.lineup.skku.booth.booth.entity.BoothType
import com.lineup.skku.booth.booth.entity.GateType
import com.lineup.skku.common.Hour
import com.lineup.skku.common.Link
import com.lineup.skku.common.Point

data class Booth (
    val id: Long,
    val categoryId: Long,
    val dtype: BoothType,
    val name: String,
    val summary: String?,
    val description: String,
    val point: Point,
    val hour: Hour,
    val images: List<String>,
    val links: List<Link>
)
