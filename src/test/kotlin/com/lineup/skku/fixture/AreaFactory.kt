package com.lineup.skku.fixture

import com.lineup.skku.area.Area
import com.lineup.skku.area.AreaEntity
import com.lineup.skku.area.AreaRepository
import com.lineup.skku.common.Hour
import com.lineup.skku.common.Link
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import java.time.LocalDateTime

@Component
class AreaFactory (
) {
    @Autowired private lateinit var areaRepository: AreaRepository
    @Autowired private lateinit var areaImageRepository: AreaImageRepository
    @Autowired private lateinit var areaLinkRepository: AreaLinkRepository

    fun create(name: String) : Area {
        val area = AreaEntity(
            name,
            "summary",
            "description",
            Hour(open = LocalDateTime.MIN, close = LocalDateTime.MAX))
        areaRepository.save(area)
        val image = AreaImageEntity(area.id, "image")
        areaImageRepository.save(image)
        val link = AreaLinkEntity(area.id, Link("label", "href"))
        areaLinkRepository.save(link)

        return Area(
            area.id,
            area.name,
            area.summary,
            area.description,
            area.hour,
            listOf(image.src),
            listOf(link.link)
        )
    }
}