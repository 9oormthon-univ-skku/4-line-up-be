package com.lineup.skku.post

import com.lineup.skku.common.CodeException
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

@Transactional(readOnly = true)
fun PostRepository.findByIdOrThrow(id: Long) = findByIdOrNull(id) ?: throw CodeException(PostExceptionCode.NOT_FOUND)
fun PostRepository.deleteByIdOrThrow(id: Long) {
    findByIdOrThrow(id)
    deleteById(id)
}

@Repository
@Transactional
interface PostRepository: JpaRepository<Post, Long>