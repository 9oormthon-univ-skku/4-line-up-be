package com.lineup.skku.booth.booth

import com.lineup.skku.common.ExceptionCode
import org.springframework.http.HttpStatus

enum class BoothExceptionCode (
    override val code: String,
    override val status: HttpStatus,
    override val message: String
) : ExceptionCode {
    NOT_FOUND("M001", HttpStatus.NOT_FOUND, "요청하신 부스를 찾을 수 없습니다."),
    NOT_VALID("M002", HttpStatus.BAD_REQUEST, "유효하지 않은 부스입니다."),
    MENU_NOT_FOUND("M003", HttpStatus.NOT_FOUND, "요청하신 메뉴를 찾을 수 없습니다."),
    CATEGORY_NOT_FOUND("M004", HttpStatus.NOT_FOUND, "요청하신 카테고리를 찾을 수 없습니다."),
}