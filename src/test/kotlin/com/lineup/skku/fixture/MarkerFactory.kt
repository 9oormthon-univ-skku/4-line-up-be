package com.lineup.skku.fixture

import com.lineup.skku.common.Hour
import com.lineup.skku.common.Link
import com.lineup.skku.common.Point
import com.lineup.skku.marker.entity.Category
import com.lineup.skku.marker.entity.Gate
import com.lineup.skku.marker.entity.GateType
import com.lineup.skku.marker.entity.Marker
import com.lineup.skku.marker.MarkerRepository
import com.lineup.skku.marker.entity.Menu
import com.lineup.skku.marker.MenuRepository
import com.lineup.skku.marker.entity.Stop
import com.lineup.skku.marker.entity.Store
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import java.time.LocalDateTime

@Component
class MarkerFactory {

    @Autowired private lateinit var markerRepository: MarkerRepository
    @Autowired private lateinit var menuRepository: MenuRepository

    fun create(name: String, category:Category) : Marker {
        val marker = Marker(
            null,
            name,
            "summary",
            "description",
            Point(0, 0),
            Hour(LocalDateTime.MIN, LocalDateTime.MAX),
            null,
            category,
            listOf("image"),
            listOf(Link("label", "href"))
        )

        return markerRepository.save(marker)
    }

    fun createGate(name: String, category:Category) : Gate {
        val gate = Gate(
            null,
            name,
            "summary",
            "description",
            Point(0, 0),
            Hour(LocalDateTime.MIN, LocalDateTime.MAX),
            null,
            category,
            listOf("image"),
            listOf(Link("label", "href")),
            GateType.ALL
        )

        return markerRepository.save(gate)
    }

    fun createStop(name: String, category:Category) : Stop {
        val stop = Stop(
            null,
            name,
            "summary",
            "description",
            Point(0, 0),
            Hour(LocalDateTime.MIN, LocalDateTime.MAX),
            null,
            category,
            mutableListOf("image"),
            mutableListOf(Link("label", "href")),
            mutableListOf(LocalDateTime.now())
        )

        return markerRepository.save(stop)
    }

    fun createStore(name: String, category:Category) : Store {
        val store = Store(
            null,
            name,
            "summary",
            "description",
            Point(0, 0),
            Hour(LocalDateTime.MIN, LocalDateTime.MAX),
            null,
            category,
            mutableListOf("image"),
            mutableListOf(Link("label", "href"))
        )

        markerRepository.save(store)
        val menu = Menu(null, "image", "menu", 10000L, store)
        menuRepository.save(menu);
        return store
    }
}