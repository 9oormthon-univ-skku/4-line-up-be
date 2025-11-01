package com.lineup.skku.area

import com.lineup.skku.common.BaseEntity
import com.lineup.skku.common.Link
import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "area_link")
class AreaLinkEntity (
    val areaId: Long,
    val link: Link,
) : BaseEntity()
