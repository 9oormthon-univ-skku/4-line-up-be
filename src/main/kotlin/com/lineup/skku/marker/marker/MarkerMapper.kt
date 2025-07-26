package com.lineup.skku.marker.marker

import com.lineup.skku.common.MapperConfig
import com.lineup.skku.marker.marker.entity.Gate
import com.lineup.skku.marker.marker.entity.Marker
import com.lineup.skku.marker.marker.entity.Stop
import com.lineup.skku.marker.marker.entity.Store
import org.mapstruct.Mapper
import org.mapstruct.Mapping
import org.mapstruct.MappingTarget
import org.mapstruct.SubclassMapping
import org.mapstruct.factory.Mappers
import java.time.LocalDateTime

@Mapper(
    config = MapperConfig::class,
    imports = [LocalDateTime::class]
)
interface MarkerMapper {
    @SubclassMapping(source = GateCreateDto::class, target = Gate::class)
    @SubclassMapping(source = StopCreateDto::class, target = Stop::class)
    @SubclassMapping(source = StoreCreateDto::class, target = Store::class)
    @Mapping(target = "id", ignore = true)
    fun toEntity(dto: MarkerCreateDto): Marker

    fun update(dto: MarkerUpdateDto, @MappingTarget marker: Marker)

    companion object {
        val INSTANCE: MarkerMapper = Mappers.getMapper(MarkerMapper::class.java)
    }
}