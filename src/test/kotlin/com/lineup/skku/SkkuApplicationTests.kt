package com.lineup.skku

import com.lineup.skku.fixture.CategoryFactory
import com.lineup.skku.fixture.MarkerFactory
import com.lineup.skku.marker.MarkerRepository
import com.lineup.skku.marker.findByIdOrThrow
import jakarta.persistence.EntityManager
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.transaction.annotation.Transactional

@SpringBootTest
@Transactional
class  SkkuApplicationTests {
	@Autowired lateinit var categoryFactory: CategoryFactory
	@Autowired lateinit var markerRepository: MarkerRepository
	@Autowired lateinit var markerFactory: MarkerFactory
	@Autowired lateinit var em: EntityManager

	@Test
	fun auditing() {
		val category = categoryFactory.create("category")
		val marker = markerFactory.create("marker", category)

		println("before persist create: ${marker.modifiedAt}")

		em.flush()
		em.clear()

		val findMarker = markerRepository.findByIdOrThrow(marker.id!!)
		println("after persist create: ${findMarker.modifiedAt}")
		findMarker.name = "new-name"
		println("before persist modify: ${findMarker.modifiedAt}")

		em.flush()
		em.clear()

		println("after persist modify: ${findMarker.modifiedAt}")
	}
}
