package com.lineup.skku.area

import com.lineup.skku.booth.booth.entity.BoothRepository
import com.lineup.skku.common.CodeException
import com.lineup.skku.common.redis.CacheTemplate
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import kotlin.jvm.optionals.getOrNull

@Service
class AreaService (
    private val areaRepository: AreaRepository,
    private val boothRepository: BoothRepository,
    private val cacheTemplate: CacheTemplate
) {
    @Transactional(readOnly = true)
    fun findAll(): List<Area> {
        return cacheTemplate.findCache("areas",
            {
                areaRepository.findAll().map {
                    Area(
                        it.id,
                        it.name,
                        it.summary,
                        it.point,
                        it.hour
                    )
                }
            }, CodeException(AreaExceptionCode.NOT_FOUND))
    }

    @Transactional(readOnly = true)
    fun findById(id: Long): Area {
        return cacheTemplate.findCache("areas/$id",
            {
                val area = areaRepository.findById(id).getOrNull()
                if (area != null) {
                    Area(
                        area.id,
                        area.name,
                        area.summary,
                        area.point,
                        area.hour,
                    )
                } else null
            },
            CodeException(AreaExceptionCode.NOT_FOUND))
    }

    @Transactional
    fun create(request: AreaCreateRequest): Area {
        val area = AreaEntity(
            request.name,
            request.summary,
            request.point,
            request.hour
        )
        areaRepository.save(area)

        cacheTemplate.removeCache("areas")
        return Area(
            area.id,
            area.name,
            area.summary,
            area.point,
            area.hour,
        )
    }

    @Transactional
    fun update(id: Long, request: AreaUpdateRequest) {
        val area = areaRepository.findByIdOrNull(id)?.takeIf { it.isActive() }
            ?: throw CodeException(AreaExceptionCode.NOT_FOUND)

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

        areaRepository.delete(area)
        cacheTemplate.removeCache("areas")
        cacheTemplate.removeCache("areas/$id")
    }
}