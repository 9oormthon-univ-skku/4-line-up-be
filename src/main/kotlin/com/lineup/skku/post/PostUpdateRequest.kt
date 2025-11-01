package com.lineup.skku.post

import com.lineup.skku.common.Link
import jakarta.validation.constraints.Size

data class PostUpdateRequest (
    @field:Size(min = 1, max = 31, message = "제목은 최소 1글자, 최대 31글자 입니다.")
    val title: String?,
    val content: String?,
    @field:Size(min = 1, message = "최소 하나 이상의 이미지를 포함해주세요.")
    val images: List<String>?,
    val links: List<Link>?
)