package com.lineup.skku.common

import jakarta.persistence.Embeddable

@Embeddable
data class Link(
    val label: String,
    val href: String
)
