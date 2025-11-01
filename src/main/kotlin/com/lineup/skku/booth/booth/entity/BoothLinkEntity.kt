package com.lineup.skku.booth.booth.entity

import com.lineup.skku.common.BaseEntity
import com.lineup.skku.common.Link
import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "booth_link")
class BoothLinkEntity (
    val boothId: Long,
    val link: Link
) : BaseEntity()
