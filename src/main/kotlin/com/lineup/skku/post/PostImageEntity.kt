package com.lineup.skku.post

import com.lineup.skku.common.BaseEntity
import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "post_image")
class PostImageEntity (
    val postId: Long,
    val src: String
) : BaseEntity()
