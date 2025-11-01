package com.lineup.skku.booth.booth

import com.lineup.skku.common.ExceptionCode
import org.springframework.http.HttpStatus

enum class BoothExceptionCode (
    override val code: String,
    override val status: HttpStatus,
    override val message: String
) : ExceptionCode {
    NOT_FOUND("B001", HttpStatus.NOT_FOUND, "요청하신 부스를 찾을 수 없습니다."),
    NOT_VALID("B002", HttpStatus.BAD_REQUEST, "유효하지 않은 부스입니다."),
    MENU_NOT_FOUND("B003", HttpStatus.NOT_FOUND, "요청하신 메뉴를 찾을 수 없습니다."),
    CATEGORY_NOT_FOUND("B004", HttpStatus.NOT_FOUND, "요청하신 카테고리를 찾을 수 없습니다."),
    INVALID_BOOTH("B005", HttpStatus.BAD_REQUEST, "유효하지 않은 게이트 타입입니다."),
    DELETE_STORE_WITH_MENU("B006", HttpStatus.BAD_REQUEST, "메뉴가 존재하는 스토어는 삭제할 수 없습니다.")
}