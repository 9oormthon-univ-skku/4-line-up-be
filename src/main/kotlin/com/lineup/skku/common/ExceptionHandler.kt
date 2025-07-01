package com.lineup.skku.common

import org.springframework.http.ResponseEntity
import org.springframework.http.converter.HttpMessageNotReadableException
import org.springframework.web.HttpMediaTypeNotSupportedException
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.MissingServletRequestParameterException
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice
import org.springframework.web.method.annotation.HandlerMethodValidationException
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException
import org.springframework.web.servlet.NoHandlerFoundException
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler
import java.io.PrintWriter
import java.io.StringWriter
import java.util.Map

@RestControllerAdvice
class ExceptionHandler : ResponseEntityExceptionHandler() {

    @ExceptionHandler(ExceptionWithCode::class)
    fun handleExceptionWithCode(ex: ExceptionWithCode): ResponseEntity<ExceptionCode> {
        logger.error { "🚨 ExceptionWithCode occurred: ${ex.message} 🚨\n${getStackTraceAsString(ex)}" }
        return ResponseEntity.status(ex.code.status)
            .body(ex.code)
    }

    @ExceptionHandler(RuntimeException::class)
    fun handleServerException(ex: RuntimeException): ResponseEntity<ExceptionCode> {
        logger.error { "🚨 InternalException occurred: ${ex.message} 🚨\n${getStackTraceAsString(ex)}" }
        return ResponseEntity.status(CommonExceptionCode.INTERNAL_SERVER_ERROR.status)
            .body(CommonExceptionCode.INTERNAL_SERVER_ERROR)
    }

    @ExceptionHandler(NoHandlerFoundException::class)
    fun handleNotFoundException(): ResponseEntity<ExceptionCode> {
        return ResponseEntity.status(CommonExceptionCode.NOT_FOUND.status)
            .body(CommonExceptionCode.NOT_FOUND)
    }

    @ExceptionHandler(MethodArgumentNotValidException::class)
    fun handleValidationError(ex: MethodArgumentNotValidException): ResponseEntity<MutableMap<String?, Any?>?> {
        return ResponseEntity.status(CommonExceptionCode.NOT_VALID.status)
            .body(Map.of<String?, Any?>("code", CommonExceptionCode.NOT_VALID.code,
                    "message", ex.bindingResult.fieldErrors.joinToString(", ") { "${it.field}: ${it.defaultMessage.orEmpty()}" }))
    }

    @ExceptionHandler(HandlerMethodValidationException::class)
    fun handleHandlerMethodValidationException(ex: HandlerMethodValidationException): ResponseEntity<ExceptionCode> {
        return ResponseEntity.status(CommonExceptionCode.NOT_VALID.status)
            .body(CommonExceptionCode.NOT_VALID)
    }

    @ExceptionHandler(HttpMessageNotReadableException::class)
    fun handleHttpMessageNotReadableException(): ResponseEntity<ExceptionCode> {
        return ResponseEntity.status(CommonExceptionCode.NOT_VALID.status)
            .body(CommonExceptionCode.NOT_VALID)
    }

    @ExceptionHandler(MethodArgumentTypeMismatchException::class)
    fun handleMethodArgumentTypeMismatchException(): ResponseEntity<ExceptionCode> {
        return ResponseEntity.status(CommonExceptionCode.TYPE_MISMATCH.status)
            .body(CommonExceptionCode.TYPE_MISMATCH)
    }

    @ExceptionHandler(MissingServletRequestParameterException::class)
    fun handleMissingServletRequestParameterException(): ResponseEntity<ExceptionCode> {
        return ResponseEntity.status(CommonExceptionCode.MISSING_PARAMETER.status)
            .body(CommonExceptionCode.MISSING_PARAMETER)
    }

    @ExceptionHandler(HttpMediaTypeNotSupportedException::class)
    fun handleHttpMediaTypeNotSupportedException(): ResponseEntity<ExceptionCode> {
        return ResponseEntity.status(CommonExceptionCode.UNSUPPORTED_MEDIA_TYPE.status)
            .body(CommonExceptionCode.UNSUPPORTED_MEDIA_TYPE)
    }

    @ExceptionHandler(AccessDeniedException::class)
    fun handleAccessDeniedException(): ResponseEntity<ExceptionCode> {
        return ResponseEntity.status(CommonExceptionCode.FORBIDDEN.status)
            .body(CommonExceptionCode.FORBIDDEN)
    }

    private fun getStackTraceAsString(ex: RuntimeException): String? {
        val sw = StringWriter()
        val pw = PrintWriter(sw)
        ex.printStackTrace(pw)
        return sw.toString()
    }
}