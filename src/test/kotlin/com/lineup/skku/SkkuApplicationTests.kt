package com.lineup.skku

import com.lineup.skku.fixture.CategoryFactory
import com.lineup.skku.fixture.MarkerFactory
import com.lineup.skku.marker.marker.MarkerRepository
import com.lineup.skku.marker.marker.findByIdOrThrow
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

		em.flush()
		em.clear()

		// 2
		val found = markerRepository.findByIdOrThrow(marker.id!!)
		markerRepository.deleteById(marker.id!!)
	}
}
