package com.lineup.skku.marker.entity

import jakarta.persistence.*

@Entity
class Menu (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "menu_id")
    val id: Long?,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "store_id", nullable = false)
    val store: Store,

    @Column(nullable = false)
    val image: String,

    @Column(nullable = false)
    val name: String,

    @Column(nullable = false)
    val price: Long,
)