package com.lineup.skku.post

import com.lineup.skku.common.BaseEntity
import com.lineup.skku.common.Link
import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "post_link")
class PostLinkEntity (
    val postId: Long,
    val link: Link
) : BaseEntity()
