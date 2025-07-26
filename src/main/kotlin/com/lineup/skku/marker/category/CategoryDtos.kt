package com.lineup.skku.marker.category

import jakarta.validation.constraints.Pattern

data class CategoryCreateDto(
    val name: String,
    val icon: String,
    @Pattern(regexp = "#[da-fA-F]{6}", message = "유효하지 않은 컬러 코드입니다.")
    val color: String,
)

data class CategoryUpdateDto(
    val name: String?,
    val icon: String?,
    @Pattern(regexp = "#[da-fA-F]{6}", message = "유효하지 않은 컬러 코드입니다.")
    val color: String?,
)