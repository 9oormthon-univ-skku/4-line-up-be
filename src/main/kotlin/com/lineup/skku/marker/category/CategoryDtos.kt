package com.lineup.skku.marker.category

import jakarta.validation.constraints.Pattern

data class CategoryCreateDto(
    var name: String,
    var icon: String,
    @Pattern(regexp = "#[da-fA-F]{6}")
    var color: String,
)

data class CategoryUpdateDto(
    var name: String?,
    var icon: String?,
    @Pattern(regexp = "#[da-fA-F]{6}")
    var color: String?,
)