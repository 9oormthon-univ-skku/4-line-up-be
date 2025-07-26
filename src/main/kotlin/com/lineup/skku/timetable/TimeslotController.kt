package com.lineup.skku.timetable

import com.lineup.skku.common.toUri
import jakarta.validation.Valid
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RequestMapping("/timetable")
@RestController
class TimeslotController (
    private val service: TimeslotService,
) {

    @PostMapping
    fun create(@Valid @RequestBody dto: TimeslotCreateDto): ResponseEntity<Long> {
        val saved = service.create(dto)
        return ResponseEntity.created("/timetable/${saved.id}".toUri())
            .body(saved.id)
    }

    @GetMapping
    fun findAll(): ResponseEntity<List<Timeslot>> {
        val result = service.findAll()
        return ResponseEntity.ok(result)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long): ResponseEntity<Void> {
        service.delete(id)
        return ResponseEntity.ok().build()
    }
}