package com.lineup.skku.area

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class AreaService (
    private val repository: AreaRepository,
    private val converter: AreaConverter
) {
    fun create(dto: AreaCreateDto): Area {
        val new = converter.toEntity(dto)
        return repository.save(new)
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
        found.update(dto)
        repository.save(found)
    }

    fun delete(id: Long) {
        val found = repository.findByIdOrThrow(id)
        repository.delete(found)
    }
}