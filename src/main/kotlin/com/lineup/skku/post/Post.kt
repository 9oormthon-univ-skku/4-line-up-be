package com.lineup.skku.post

import com.lineup.skku.common.BaseEntity
import com.lineup.skku.common.Link
import jakarta.persistence.Column
import jakarta.persistence.ElementCollection
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.JoinTable

@Entity
class Post (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id")
    val id: Long?,

    @Column(nullable = false)
    var title: String,

    @Column(nullable = false)
    var content: String,

    @ElementCollection
    @JoinTable(name = "marker_image",
        joinColumns = [JoinColumn(name = "marker_id")])
    @Column(name = "src")
    val images: MutableList<String> = mutableListOf(),

    @ElementCollection
    @JoinTable(name = "marker_link",
        joinColumns = [JoinColumn(name = "marker_id")])
    val links: MutableList<Link> = mutableListOf()
) : BaseEntity()