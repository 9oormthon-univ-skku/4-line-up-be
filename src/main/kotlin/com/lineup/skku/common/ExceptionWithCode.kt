package com.lineup.skku.common

data class ExceptionWithCode(
    val code: ExceptionCode
) : RuntimeException()