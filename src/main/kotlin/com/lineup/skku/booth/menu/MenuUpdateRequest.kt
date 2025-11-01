package com.lineup.skku.booth.menu

import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import org.hibernate.validator.constraints.URL

data class MenuUpdateRequest(
    @field:URL(message = "유효하지 않은 이미지 URL 형식입니다.")
    val image: String?,
    @field:Size(min = 1, max = 31, message = "이름은 최소 1글자, 최대 31글자 입니다.")
    val name: String?,
    @field:DecimalMax(value = "100000", message = "가격은 최대 10만원입니다.")
    val price: Long?,
)