package com.lineup.skku.post

import com.lineup.skku.common.Link

data class Post(
    val id: Long,
    val title: String,
    val content: String,
    val images: List<String>,
    val links: List<Link>
 )