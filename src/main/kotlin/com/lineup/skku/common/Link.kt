package com.lineup.skku.common

import jakarta.persistence.Embeddable
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size
import org.hibernate.validator.constraints.URL

@Embeddable
data class Link(
    @field:NotBlank(message = "링크 제목을 입력해주세요.")
    @field:Size(min = 1, max = 31, message = "링크 제목은 최소 1글자, 최대 31글자 입니다.")
    val label: String,

    @field:URL(message = "유효하지 않은 URL 형식입니다.")
    val href: String
)
