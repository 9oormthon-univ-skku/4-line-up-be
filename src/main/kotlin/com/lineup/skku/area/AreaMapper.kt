package com.lineup.skku.area

import com.lineup.skku.common.MapperConfig
import org.mapstruct.Mapper
import org.mapstruct.Mapping
import org.mapstruct.MappingTarget
import org.mapstruct.factory.Mappers
import java.time.LocalDateTime


@Mapper(
    config = MapperConfig::class,
    imports = [LocalDateTime::class]
)interface AreaMapper {
    @Mapping(target = "id", ignore = true)
    fun toEntity(dto: AreaCreateDto): Area

    fun update(dto: AreaUpdateDto, @MappingTarget area: Area)

    companion object {
        val INSTANCE: AreaMapper = Mappers.getMapper(AreaMapper::class.java)
    }
}