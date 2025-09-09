package com.lineup.skku.area

import com.lineup.skku.booth.booth.BoothRepository
import com.lineup.skku.common.CodeException
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class AreaService (
    private val areaRepository: AreaRepository,
    private val boothRepository: BoothRepository,
    private val areaConverter: AreaConverter
) {
    fun create(dto: AreaCreateDto): Area {
        val new = areaConverter.toEntity(dto)
        return areaRepository.save(new)
    }

    @Transactional(readOnly = true)
    fun findAll(): List<Area> {
        return areaRepository.findAll()
    }

    @Transactional(readOnly = true)
    fun findById(id: Long): Area {
        return areaRepository.findByIdOrThrow(id)
    }

    fun update(id: Long, dto: AreaUpdateDto) {
        val found = areaRepository.findByIdOrThrow(id)
        found.update(dto)
        areaRepository.save(found)
    }

    fun delete(id: Long) {
        val found = areaRepository.findByIdOrThrow(id)
        if (boothRepository.findAllByAreaId(id).isNotEmpty())
            throw CodeException(AreaExceptionCode.DELETE_AREA_WITH_BOOTH)
        areaRepository.delete(found)
    }
}