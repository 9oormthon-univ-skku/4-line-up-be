package com.lineup.skku.marker

import com.lineup.skku.common.ExceptionCode
import org.springframework.http.HttpStatus

enum class MarkerExceptionCode (
    override val code: String,
    override val status: HttpStatus,
    override val message: String
) : ExceptionCode {
    NOT_FOUND("M001", HttpStatus.NOT_FOUND, "요청하신 마커를 찾을 수 없습니다.")
}