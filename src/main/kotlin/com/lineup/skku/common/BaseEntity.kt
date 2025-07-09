package com.lineup.skku.common

import jakarta.persistence.Column
import jakarta.persistence.MappedSuperclass
import jakarta.persistence.PreUpdate
import java.time.LocalDateTime

@MappedSuperclass
class BaseEntity {
    @Column(nullable = false)
    val createdAt: LocalDateTime = LocalDateTime.now();

    @Column(nullable = false)
    var modifiedAt: LocalDateTime = LocalDateTime.now()
        protected set

    @PreUpdate
    fun preUpdate() {
        modifiedAt = LocalDateTime.now()
    }
}