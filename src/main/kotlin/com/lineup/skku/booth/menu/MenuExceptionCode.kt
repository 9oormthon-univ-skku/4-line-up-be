package com.lineup.skku.booth.menu

import com.lineup.skku.common.ExceptionCode
import org.springframework.http.HttpStatus

enum class MenuExceptionCode (
    override val code: String,
    override val status: HttpStatus,
    override val message: String
) : ExceptionCode {
    NOT_FOUND("M001", HttpStatus.BAD_REQUEST, "요청하신 메뉴를 찾을 수 없습니다."),
}