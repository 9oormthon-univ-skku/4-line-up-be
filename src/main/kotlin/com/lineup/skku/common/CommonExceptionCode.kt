package com.lineup.skku.common

import org.springframework.http.HttpStatus

enum class CommonExceptionCode(
    override val code: String,
    override val status: HttpStatus,
    override val message: String
) : ExceptionCode {
    NOT_VALID ("C001", HttpStatus.BAD_REQUEST, "유효하지 않은 입력값입니다."),
    TYPE_MISMATCH ("C002", HttpStatus.BAD_REQUEST, "기대하는 타입과 일치하지 않습니다."),
    MISSING_PARAMETER ("C003", HttpStatus.BAD_REQUEST,"필수 요청 파라미터가 누락되었습니다."),
    FORBIDDEN ("C004", HttpStatus.FORBIDDEN,"리소스 접근 권한이 없습니다."),
    NOT_FOUND ("C005", HttpStatus.NOT_FOUND,"요청하신 경로를 찾을 수 없습니다."),
    UNSUPPORTED_MEDIA_TYPE ("C006", HttpStatus.UNSUPPORTED_MEDIA_TYPE,"지원하지 않는 미디어 형식입니다."),
    INTERNAL_SERVER_ERROR ("C007", HttpStatus.INTERNAL_SERVER_ERROR,"서버 내부 오류입니다.");
}