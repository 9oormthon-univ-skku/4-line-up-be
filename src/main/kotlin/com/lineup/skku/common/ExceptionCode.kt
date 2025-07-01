package com.lineup.skku.common

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import org.springframework.http.HttpStatus

@JsonIgnoreProperties("status")
interface ExceptionCode {
    val code: String
    val status: HttpStatus
    val message: String
}