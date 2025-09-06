package com.lineup.skku.fixture

import com.lineup.skku.booth.booth.BoothRepository
import com.lineup.skku.booth.booth.entity.*
import com.lineup.skku.booth.category.Category
import com.lineup.skku.booth.menu.Menu
import com.lineup.skku.booth.menu.MenuRepository
import com.lineup.skku.common.Hour
import com.lineup.skku.common.Link
import com.lineup.skku.common.Point
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import java.time.LocalDateTime
import java.time.LocalTime

@Component
class BoothFactory {

    @Autowired private lateinit var boothRepository: BoothRepository
    @Autowired private lateinit var menuRepository: MenuRepository

    fun create(name: String, category:Category) : Booth {
        val booth = Booth(
            0L,
            null,
            category,
            name,
            "summary",
            "description",
            Point(0, 0),
            Hour(LocalDateTime.MIN, LocalDateTime.MAX),
            mutableListOf("image"),
            mutableListOf(Link("label", "href"))
        )

        return boothRepository.save(booth)
    }

    fun createGate(name: String, category:Category) : Gate {
        val gate = Gate(
            0L,
            null,
            category,
            name,
            "summary",
            "description",
            Point(0, 0),
            Hour(LocalDateTime.MIN, LocalDateTime.MAX),
            mutableListOf("image"),
            mutableListOf(Link("label", "href")),
            GateType.ALL
        )

        return boothRepository.save(gate)
    }

    fun createStop(name: String, category:Category) : Stop {
        val stop = Stop(
            0L,
            null,
            category,
            name,
            "summary",
            "description",
            Point(0, 0),
            Hour(LocalDateTime.MIN, LocalDateTime.MAX),
            mutableListOf("image"),
            mutableListOf(Link("label", "href")),
            mutableListOf(LocalTime.now())
        )

        return boothRepository.save(stop)
    }

    fun createStore(name: String, category:Category) : Store {
        val store = Store(
            0L,
            null,
            category,
            name,
            "summary",
            "description",
            Point(0, 0),
            Hour(LocalDateTime.MIN, LocalDateTime.MAX),
            mutableListOf("image"),
            mutableListOf(Link("label", "href"))
        )

        boothRepository.save(store)
        val menu = Menu(0L, store, "image", "menu", 10000L)
        menuRepository.save(menu)
        return store
    }
}