package com.lineup.skku.common

data class CodeException(
    val code: ExceptionCode
) : RuntimeException()