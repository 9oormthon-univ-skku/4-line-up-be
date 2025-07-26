package com.lineup.skku.marker.menu

import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import org.hibernate.validator.constraints.URL

data class MenuCreateDto(
    @field:NotBlank(message = "이미지를 입력해주세요.")
    @field:URL(message = "유효하지 않은 이미지 URL 형식입니다.")
    val image: String,
    @field:NotBlank(message = "이름을 입력해주세요.")
    @field:Size(min = 1, max = 31, message = "이름은 최소 1글자, 최대 31글자 입니다.")
    val name: String,
    @field:DecimalMax(value = "100000", message = "가격은 최대 10만원입니다.")
    @field:NotNull(message = "가격을 입력해주세요.")
    val price: Long,
)

data class MenuUpdateDto(
    @field:URL(message = "유효하지 않은 이미지 URL 형식입니다.")
    val image: String?,
    @field:Size(min = 1, max = 31, message = "이름은 최소 1글자, 최대 31글자 입니다.")
    val name: String?,
    @field:DecimalMax(value = "100000", message = "가격은 최대 10만원입니다.")
    val price: Long?,
)