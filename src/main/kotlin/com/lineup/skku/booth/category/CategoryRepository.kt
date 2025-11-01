package com.lineup.skku.booth.category

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

@Repository
@Transactional
interface CategoryRepository: JpaRepository<CategoryEntity, Long>