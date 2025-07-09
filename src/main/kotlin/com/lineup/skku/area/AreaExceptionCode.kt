package com.lineup.skku.area

import com.lineup.skku.common.ExceptionCode
import org.springframework.http.HttpStatus

enum class AreaExceptionCode (
    override val code: String,
    override val status: HttpStatus,
    override val message: String
) : ExceptionCode {
    NOT_FOUND("A001", HttpStatus.NOT_FOUND, "요청하신 구역을 찾을 수 없습니다.")
}