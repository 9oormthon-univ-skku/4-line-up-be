package com.lineup.skku.common

import org.springframework.beans.TypeMismatchException
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpStatusCode
import org.springframework.http.ResponseEntity
import org.springframework.http.converter.HttpMessageNotReadableException
import org.springframework.web.HttpMediaTypeNotSupportedException
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.MissingServletRequestParameterException
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice
import org.springframework.web.context.request.WebRequest
import org.springframework.web.method.annotation.HandlerMethodValidationException
import org.springframework.web.servlet.NoHandlerFoundException
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler
import java.io.PrintWriter
import java.io.StringWriter
import java.util.Map

@RestControllerAdvice
class ExceptionHandler : ResponseEntityExceptionHandler() {

    @ExceptionHandler(CodeException::class)
    fun handleExceptionWithCode(ex: CodeException): ResponseEntity<ExceptionCode> {
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

    override fun handleHttpMediaTypeNotSupported(
        ex: HttpMediaTypeNotSupportedException,
        headers: HttpHeaders,
        status: HttpStatusCode,
        request: WebRequest
    ): ResponseEntity<Any> {
        return ResponseEntity.status(CommonExceptionCode.UNSUPPORTED_MEDIA_TYPE.status)
            .body(CommonExceptionCode.UNSUPPORTED_MEDIA_TYPE)
    }

    override fun handleMissingServletRequestParameter(
        ex: MissingServletRequestParameterException,
        headers: HttpHeaders,
        status: HttpStatusCode,
        request: WebRequest
    ): ResponseEntity<Any> {
        return ResponseEntity.status(CommonExceptionCode.MISSING_PARAMETER.status)
            .body(CommonExceptionCode.MISSING_PARAMETER)
    }

    override fun handleMethodArgumentNotValid(
        ex: MethodArgumentNotValidException,
        headers: HttpHeaders,
        status: HttpStatusCode,
        request: WebRequest
    ): ResponseEntity<Any> {
        return ResponseEntity.status(CommonExceptionCode.NOT_VALID.status)
            .body(Map.of<String, Any>("code", CommonExceptionCode.NOT_VALID.code,
                "message", ex.bindingResult.fieldErrors.joinToString(", ") { "${it.field}: ${it.defaultMessage.orEmpty()}" }))
    }

    override fun handleHandlerMethodValidationException(
        ex: HandlerMethodValidationException,
        headers: HttpHeaders,
        status: HttpStatusCode,
        request: WebRequest
    ): ResponseEntity<Any> {
        return ResponseEntity.status(CommonExceptionCode.NOT_VALID.status)
            .body(CommonExceptionCode.NOT_VALID)
    }

    override fun handleNoHandlerFoundException(
        ex: NoHandlerFoundException,
        headers: HttpHeaders,
        status: HttpStatusCode,
        request: WebRequest
    ): ResponseEntity<Any> {
        return ResponseEntity.status(CommonExceptionCode.NOT_FOUND.status)
            .body(CommonExceptionCode.NOT_FOUND)
    }

    override fun handleTypeMismatch(
        ex: TypeMismatchException,
        headers: HttpHeaders,
        status: HttpStatusCode,
        request: WebRequest
    ): ResponseEntity<Any> {
        return ResponseEntity.status(CommonExceptionCode.TYPE_MISMATCH.status)
            .body(CommonExceptionCode.TYPE_MISMATCH)
    }

    override fun handleHttpMessageNotReadable(
        ex: HttpMessageNotReadableException,
        headers: HttpHeaders,
        status: HttpStatusCode,
        request: WebRequest
    ): ResponseEntity<Any> {
        return ResponseEntity.status(CommonExceptionCode.NOT_VALID.status)
            .body(CommonExceptionCode.NOT_VALID)
    }

    @ExceptionHandler(AccessDeniedException::class)
    fun handleAccessDeniedException(): ResponseEntity<ExceptionCode> {
        return ResponseEntity.status(CommonExceptionCode.FORBIDDEN.status)
            .body(CommonExceptionCode.FORBIDDEN)
    }

    private fun getStackTraceAsString(ex: RuntimeException): String {
        val sw = StringWriter()
        val pw = PrintWriter(sw)
        ex.printStackTrace(pw)
        return sw.toString()
    }
}