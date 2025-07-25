package com.lineup.skku.category.category

import com.lineup.skku.marker.category.Category
import com.lineup.skku.marker.category.CategoryCreateDto
import com.lineup.skku.marker.category.CategoryUpdateDto
import org.mapstruct.Mapper
import org.mapstruct.Mapping
import org.mapstruct.MappingTarget
import org.mapstruct.factory.Mappers
import java.time.LocalDateTime

@Mapper(imports = [LocalDateTime::class])
interface CategoryMapper {
    @Mapping(target = "id", ignore = true)
    fun toEntity(dto: CategoryCreateDto): Category

    fun update(dto: CategoryUpdateDto, @MappingTarget category: Category)

    companion object {
        val INSTANCE: CategoryMapper = Mappers.getMapper(CategoryMapper::class.java)
    }
}