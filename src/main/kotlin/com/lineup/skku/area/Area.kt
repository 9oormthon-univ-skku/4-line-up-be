package com.lineup.skku.area

import com.lineup.skku.common.Hour
import com.lineup.skku.common.Link

data class Area(
    val id: Long,
    val name: String,
    val summary: String?,
    val description: String,
    val hour: Hour,
    val images: List<String>,
    val links: List<Link>
)