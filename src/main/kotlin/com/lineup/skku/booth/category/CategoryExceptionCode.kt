package com.lineup.skku.booth.category

import com.lineup.skku.common.ExceptionCode
import org.springframework.http.HttpStatus

enum class CategoryExceptionCode (
    override val code: String,
    override val status: HttpStatus,
    override val message: String
) : ExceptionCode {
    NOT_FOUND("C001", HttpStatus.BAD_REQUEST, "요청하신 카테고리를 찾을 수 없습니다."),
    DELETE_CATEGORY_WITH_BOOTH("C002", HttpStatus.BAD_REQUEST, "부스가 존재하는 카테고리는 삭제할 수 없습니다.")
}