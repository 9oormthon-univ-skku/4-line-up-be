package com.lineup.skku.post

import com.lineup.skku.common.ExceptionCode
import org.springframework.http.HttpStatus

enum class PostExceptionCode (
    override val code: String,
    override val status: HttpStatus,
    override val message: String
) : ExceptionCode {
    NOT_FOUND("P001", HttpStatus.NOT_FOUND, "요청하신 게시글을 찾을 수 없습니다.")
}