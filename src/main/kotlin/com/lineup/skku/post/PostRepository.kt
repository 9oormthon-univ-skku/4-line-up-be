package com.lineup.skku.post

import com.lineup.skku.common.CodeException
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

fun PostRepository.findByIdOrThrow(id: Long) = findByIdOrNull(id) ?: throw CodeException(PostExceptionCode.NOT_FOUND)

@Repository
@Transactional(readOnly = true)
interface PostRepository: JpaRepository<Post, Long>