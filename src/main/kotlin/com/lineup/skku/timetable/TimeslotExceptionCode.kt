package com.lineup.skku.timetable

import com.lineup.skku.common.ExceptionCode
import org.springframework.http.HttpStatus

enum class TimeslotExceptionCode (
    override val code: String,
    override val status: HttpStatus,
    override val message: String
) : ExceptionCode {
    NOT_FOUND("T001", HttpStatus.NOT_FOUND, "요청하신 타임 라인을 찾을 수 없습니다.")
}