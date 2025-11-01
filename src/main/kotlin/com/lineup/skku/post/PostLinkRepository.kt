package com.lineup.skku.post

import org.springframework.data.jpa.repository.JpaRepository

interface PostLinkRepository: JpaRepository<PostLinkEntity, Long> {
    fun findByPostId(postId: Long): List<PostLinkEntity>
    fun deleteByPostId(postId: Long)
}