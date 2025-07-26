package com.lineup.skku.post

import com.lineup.skku.common.BaseEntity
import com.lineup.skku.common.Link
import jakarta.persistence.*

@Entity
class Post (
    id: Long = 0L,

    @Column(nullable = false)
    var title: String,

    @Column(nullable = false)
    var content: String,

    @ElementCollection(fetch = FetchType.EAGER)
    @JoinTable(name = "post_image",
        joinColumns = [JoinColumn(name = "post_id")])
    @Column(name = "src")
    val images: MutableList<String> = mutableListOf(),

    @ElementCollection(fetch = FetchType.EAGER)
    @JoinTable(name = "post_link",
        joinColumns = [JoinColumn(name = "post_id")])
    val links: MutableList<Link> = mutableListOf()
) : BaseEntity(id) {

    fun update(dto: PostUpdateDto) {
        title = dto.title ?: title
        content = dto.content ?: content
        if (dto.images != null) {
            images.clear()
            images.addAll(dto.images)
        }
        if (dto.links != null) {
            links.clear()
            links.addAll(dto.links)
        }
    }
}