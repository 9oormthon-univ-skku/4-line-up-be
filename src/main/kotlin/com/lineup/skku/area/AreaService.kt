package com.lineup.skku.area

import com.lineup.skku.booth.booth.BoothRepository
import com.lineup.skku.common.CodeException
import com.lineup.skku.common.redis.CacheTemplate
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import kotlin.collections.map
import kotlin.jvm.optionals.getOrNull

@Service
class AreaService (
    private val areaRepository: AreaRepository,
    private val areaImageRepository: AreaImageRepository,
    private val areaLinkRepository: AreaLinkRepository,
    private val boothRepository: BoothRepository,
    private val cacheTemplate: CacheTemplate
) {
    @Transactional
    fun create(request: AreaCreateRequest): Area {
        val area = AreaEntity(
            request.name,
            request.summary,
            request.description,
            request.hour
        )
        areaRepository.save(area)
        val images = request.images.map { AreaImageEntity(area.id, it) }
        areaImageRepository.saveAll(images)
        val links = request.links.map { AreaLinkEntity(area.id, it) }
        areaLinkRepository.saveAll(links)

        return Area(
            area.id,
            area.name,
            area.summary,
            area.description,
            area.hour,
            images.map { it.src },
            links.map { it.link }
        )
    }

    @Transactional(readOnly = true)
    fun findAll(): List<Area> {
        return cacheTemplate.findCache("areas",
            {
                val areas = areaRepository.findAll()
                val images = areaImageRepository.findByAreaIdIn(areas.map { it.id })
                    .filter { it.isActive() }
                    .groupBy { it.areaId }
                val links = areaLinkRepository.findByAreaIdIn(areas.map { it.id })
                    .filter { it.isActive() }
                    .groupBy { it.areaId }

                areas.map { Area(
                    it.id,
                    it.name,
                    it.summary,
                    it.description,
                    it.hour,
                    images[it.id]?.map { it.src} ?: listOf(),
                    links[it.id]?.map { it.link } ?: listOf(),
                ) }
            }, CodeException(AreaExceptionCode.NOT_FOUND))
    }

    @Transactional(readOnly = true)
    fun findById(id: Long): Area {
        return cacheTemplate.findCache("areas/$id",
            {
                val area = areaRepository.findById(id).getOrNull()
                if(area != null) {
                    val images = areaImageRepository.findByAreaId(area.id)
                    val links = areaLinkRepository.findByAreaId(area.id)
                    Area(
                        area.id,
                        area.name,
                        area.summary,
                        area.description,
                        area.hour,
                        images.map { it.src },
                        links.map { it.link },
                    )
                } else null
            },
            CodeException(AreaExceptionCode.NOT_FOUND))
    }

    @Transactional
    fun update(id: Long, request: AreaUpdateRequest) {
        val area = areaRepository.findByIdOrNull(id)?.takeIf { it.isActive() }
            ?: throw CodeException(AreaExceptionCode.NOT_FOUND)

        if (request.images != null) {
            areaImageRepository.deleteByAreaId(area.id)
            val images = request.images.map { AreaImageEntity(area.id, it) }
            areaImageRepository.saveAll(images)
        }

        if (request.links != null) {
            areaLinkRepository.deleteByAreaId(area.id)
            val links = request.links.map { AreaLinkEntity(area.id, it) }
            areaLinkRepository.saveAll(links)
        }

        area.update(request)
        areaRepository.save(area)
        cacheTemplate.removeCache("areas")
        cacheTemplate.removeCache("areas/$id")
    }

    @Transactional
    fun delete(id: Long) {
        val area = areaRepository.findByIdOrNull(id)?.takeIf { it.isActive() }
            ?: throw CodeException(AreaExceptionCode.NOT_FOUND)

        if (boothRepository.findAllByAreaId(id).isNotEmpty())
            throw CodeException(AreaExceptionCode.DELETE_AREA_WITH_BOOTH)

        areaImageRepository.deleteByAreaId(area.id)
        areaLinkRepository.deleteByAreaId(area.id)

        areaRepository.delete(area)
        cacheTemplate.removeCache("areas")
        cacheTemplate.removeCache("areas/$id")
    }
}