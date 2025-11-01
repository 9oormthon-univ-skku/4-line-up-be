package com.lineup.skku.post

import org.springframework.data.jpa.repository.JpaRepository

interface PostImageRepository: JpaRepository<PostImageEntity, Long> {
    fun findByPostId(postId: Long): List<PostImageEntity>
    fun deleteByPostId(postId: Long)
}