package com.lineup.skku.common

import jakarta.persistence.Embeddable

@Embeddable
data class Point(
    val x: Int,
    val y: Int
)
