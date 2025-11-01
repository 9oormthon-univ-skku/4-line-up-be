package com.lineup.skku.common

import jakarta.persistence.*
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime

@MappedSuperclass
abstract class BaseEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0

    @Enumerated(EnumType.STRING)
    private var status: EntityStatus = EntityStatus.ACTIVE

    @CreationTimestamp
    val createdAt: LocalDateTime = LocalDateTime.MIN

    @UpdateTimestamp
    val updatedAt: LocalDateTime = LocalDateTime.MIN

    fun active() {
        status = EntityStatus.ACTIVE
    }

    fun isActive(): Boolean {
        return status == EntityStatus.ACTIVE
    }

    fun delete() {
        status = EntityStatus.DELETED
    }

    fun isDeleted(): Boolean {
        return status == EntityStatus.DELETED
    }

    override fun equals(other: Any?): Boolean {
        if (other == null || other !is BaseEntity) return false
        return id == other.id
    }

    override fun hashCode(): Int {
        return id.hashCode()
    }
}