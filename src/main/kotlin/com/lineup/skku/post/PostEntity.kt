package com.lineup.skku.post

import com.lineup.skku.common.BaseEntity
import jakarta.persistence.*

@Entity
@Table(name = "post")
class PostEntity (
    title: String,
    thumbnail: String,
    content: String,
) : BaseEntity() {
    var title: String = title
        protected set

    var thumbnail: String = thumbnail
        protected set

    var content: String = content
        protected set

    fun update(request: PostUpdateRequest) {
        title = request.title ?: title
        thumbnail = request.images?.get(0) ?: thumbnail
        content = request.content ?: content
    }
}