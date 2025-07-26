package com.lineup.skku.area

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class AreaService (
    private val repository: AreaRepository
) {
    private final val mapper = AreaMapper.INSTANCE

    fun create(area: Area): Area {
        return repository.save(area)
    }

    @Transactional(readOnly = true)
    fun findAll(): List<Area> {
        return repository.findAll()
    }

    @Transactional(readOnly = true)
    fun findById(id: Long): Area {
        return repository.findByIdOrThrow(id)
    }

    fun update(id: Long, dto: AreaUpdateDto) {
        val found = repository.findByIdOrThrow(id)
        mapper.update(dto, found)
        repository.save(found)
    }

    fun delete(id: Long) {
        val found = repository.findByIdOrThrow(id)
        repository.delete(found)
    }
}