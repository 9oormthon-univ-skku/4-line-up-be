package com.lineup.skku.marker

import com.lineup.skku.marker.entity.Category
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

@Repository
@Transactional(readOnly = true)
interface CategoryRepository: JpaRepository<Category, Long>