package com.lineup.skku.booth.booth

import com.lineup.skku.area.AreaExceptionCode
import com.lineup.skku.area.AreaRepository
import com.lineup.skku.booth.booth.entity.*
import com.lineup.skku.booth.category.Category
import com.lineup.skku.booth.category.CategoryExceptionCode
import com.lineup.skku.booth.category.CategoryRepository
import com.lineup.skku.booth.menu.MenuRepository
import com.lineup.skku.common.CodeException
import com.lineup.skku.common.redis.CacheTemplate
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class BoothService (
    private val areaRepository: AreaRepository,
    private val categoryRepository: CategoryRepository,
    private val boothRepository: BoothRepository,
    private val boothImageRepository: BoothImageRepository,
    private val boothLinkRepository: BoothLinkRepository,
    private val menuRepository: MenuRepository,
    private val cacheTemplate: CacheTemplate
){
    @Transactional(readOnly = true)
    fun findAll(): List<BoothSummary> {
        return cacheTemplate.findCache("booths",
            {
                boothRepository.findAll().map {
                    System.out.println("booth: ${it.id}")
                    BoothSummary(
                        it.id,
                        it.categoryId,
                        it.thumbnail,
                        it.name,
                        it.summary,
                        it.point,
                        it.hour
                    ) }
            }, CodeException(BoothExceptionCode.NOT_FOUND))
    }

    @Transactional(readOnly = true)
    fun findById(id: Long): Booth {
        return cacheTemplate.findCache("booths/$id", {
            val booth = boothRepository.findByIdOrNull(id)
            if (booth != null) {
                val images = boothImageRepository.findByBoothId(booth.id)
                val links = boothLinkRepository.findByBoothId(booth.id)
                Booth(
                    booth.id,
                    booth.categoryId,
                    booth.dtype,
                    booth.name,
                    booth.summary,
                    booth.description,
                    booth.point,
                    booth.hour,
                    images.map { it.src },
                    links.map { it.link }
                )
            } else null
        }, CodeException(BoothExceptionCode.NOT_FOUND))
    }

    @Transactional
    fun create(request: BoothCreateRequest): Booth {
        if (request.areaId != null) areaRepository.findByIdOrNull(request.areaId) ?: throw CodeException(AreaExceptionCode.NOT_FOUND)
        val category = categoryRepository.findByIdOrNull(request.categoryId) ?: throw CodeException(CategoryExceptionCode.NOT_FOUND)

        val booth = BoothEntity(
            request.areaId,
            request.categoryId,
            request.dtype,
            request.images[0],
            request.name,
            request.summary,
            request.description,
            request.point,
            request.hour,
            request.gateType,
        )
        booth.validate()
        boothRepository.save(booth)

        val images = request.images.map { BoothImageEntity(booth.id, it) }
        boothImageRepository.saveAll(images)
        val links = request.links.map { BoothLinkEntity(booth.id, it) }
        boothLinkRepository.saveAll(links)

        cacheTemplate.removeCache("booths")
        return Booth(
            booth.id,
            category.id,
            booth.dtype,
            booth.name,
            booth.summary,
            booth.description,
            booth.point,
            booth.hour,
            images.map { it.src },
            links.map { it.link }
        )
    }

    @Transactional
    fun update(id: Long, request: BoothUpdateRequest) {
        val booth = boothRepository.findByIdOrNull(id)?.takeIf { it.isActive() }
            ?: throw CodeException(BoothExceptionCode.NOT_FOUND)

        if (request.images != null) {
            boothImageRepository.deleteByBoothId(booth.id)
            val images = request.images.map { BoothImageEntity(booth.id, it) }
            boothImageRepository.saveAll(images)
        }

        if (request.links != null) {
            boothLinkRepository.deleteByBoothId(booth.id)
            val links = request.links.map { BoothLinkEntity(booth.id, it) }
            boothLinkRepository.saveAll(links)
        }

        booth.update(request)
        booth.validate()
        boothRepository.save(booth)
        cacheTemplate.removeCache("booths")
        cacheTemplate.removeCache("booths/$id")
    }

    @Transactional
    fun delete(id: Long) {
        val booth = boothRepository.findByIdOrNull(id)?.takeIf { it.isActive() }
            ?: throw CodeException(BoothExceptionCode.NOT_FOUND)

        if (menuRepository.findAllByStoreId(id).isNotEmpty())
            throw CodeException(BoothExceptionCode.DELETE_STORE_WITH_MENU)

        boothImageRepository.deleteByBoothId(booth.id)
        boothLinkRepository.deleteByBoothId(booth.id)

        boothRepository.delete(booth)
        cacheTemplate.removeCache("booths")
        cacheTemplate.removeCache("booths/$id")
    }
}