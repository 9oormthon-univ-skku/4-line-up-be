package com.lineup.skku.booth.booth

import com.lineup.skku.common.Hour
import com.lineup.skku.common.Point

data class BoothSummary (
    val id: Long,
    val categoryId: Long,
    val thumbnail: String,
    val name: String,
    val summary: String?,
    val point: Point,
    val hour: Hour,
)