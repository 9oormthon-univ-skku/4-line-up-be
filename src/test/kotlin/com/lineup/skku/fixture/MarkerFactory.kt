package com.lineup.skku.fixture

import com.lineup.skku.common.Hour
import com.lineup.skku.common.Link
import com.lineup.skku.common.Point
import com.lineup.skku.marker.category.Category
import com.lineup.skku.marker.marker.entity.Gate
import com.lineup.skku.marker.marker.entity.GateType
import com.lineup.skku.marker.marker.entity.Marker
import com.lineup.skku.marker.marker.MarkerRepository
import com.lineup.skku.marker.menu.Menu
import com.lineup.skku.marker.menu.MenuRepository
import com.lineup.skku.marker.marker.entity.Stop
import com.lineup.skku.marker.marker.entity.Store
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import java.time.LocalTime

@Component
class MarkerFactory {

    @Autowired private lateinit var markerRepository: MarkerRepository
    @Autowired private lateinit var menuRepository: MenuRepository

    fun create(name: String, category:Category) : Marker {
        val marker = Marker(
            0L,
            null,
            category,
            name,
            "summary",
            "description",
            Point(0, 0),
            Hour(LocalTime.MIN, LocalTime.MAX),
            mutableListOf("image"),
            mutableListOf(Link("label", "href"))
        )

        return markerRepository.save(marker)
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
            Hour(LocalTime.MIN, LocalTime.MAX),
            mutableListOf("image"),
            mutableListOf(Link("label", "href")),
            GateType.ALL
        )

        return markerRepository.save(gate)
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
            Hour(LocalTime.MIN, LocalTime.MAX),
            mutableListOf("image"),
            mutableListOf(Link("label", "href")),
            mutableListOf(LocalTime.now())
        )

        return markerRepository.save(stop)
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
            Hour(LocalTime.MIN, LocalTime.MAX),
            mutableListOf("image"),
            mutableListOf(Link("label", "href"))
        )

        markerRepository.save(store)
        val menu = Menu(0L, store, "image", "menu", 10000L)
        menuRepository.save(menu)
        return store
    }
}