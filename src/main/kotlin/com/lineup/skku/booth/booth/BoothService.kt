package com.lineup.skku.booth.booth

import com.lineup.skku.area.Area
import com.lineup.skku.booth.booth.entity.Booth
import com.lineup.skku.booth.category.Category
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class BoothService (
    private val repository : BoothRepository,
    private val converter : BoothConverter,
){

    fun create(dto: BoothCreateDto, area: Area?, category: Category): Booth {
        val new = converter.toEntity(area, category, dto)
        return repository.save(new)
    }

    @Transactional(readOnly = true)
    fun findAll(): List<Booth> {
        return repository.findAll()
    }

    @Transactional(readOnly = true)
    fun findById(id: Long): Booth {
        return repository.findByIdOrThrow(id)
    }

    fun update(id: Long, dto: BoothUpdateDto) {
        val found = repository.findByIdOrThrow(id)
        found.update(dto)
        repository.save(found)
    }

    fun delete(id: Long) {
        repository.deleteByIdOrThrow(id)
    }

    fun updateCategory(booth: Booth, category: Category) {
        booth.category = category
        repository.save(booth)
    }

    fun updateArea(booth: Booth, area: Area?) {
        booth.areaId = area?.id
        repository.save(booth)
    }
}