package com.lineup.skku.marker.marker

import com.lineup.skku.area.Area
import com.lineup.skku.marker.category.Category
import com.lineup.skku.marker.marker.entity.Marker
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class MarkerService (
    private val repository : MarkerRepository,
    private val converter : MarkerConverter,
){

    fun create(dto: MarkerCreateDto, area: Area?, category: Category): Marker {
        val new = converter.toEntity(area, category, dto)
        return repository.save(new)
    }

    @Transactional(readOnly = true)
    fun findAll(): List<Marker> {
        return repository.findAll()
    }

    @Transactional(readOnly = true)
    fun findById(id: Long): Marker {
        return repository.findByIdOrThrow(id)
    }

    fun update(id: Long, dto: MarkerUpdateDto) {
        val found = repository.findByIdOrThrow(id)
        found.update(dto)
        repository.save(found)
    }

    fun delete(id: Long) {
        repository.deleteByIdOrThrow(id)
    }

    fun updateCategory(marker: Marker, category: Category?) {
        marker.category = category
        repository.save(marker)
    }

    fun updateArea(marker: Marker, area: Area?) {
        marker.area = area
        repository.save(marker)
    }
}