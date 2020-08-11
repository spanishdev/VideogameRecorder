package com.radioactivewasp.videogamerecords.dummy

import com.radioactivewasp.videogamerecords.model.data.Game
import com.radioactivewasp.videogamerecords.model.data.InvolvedCompany
import com.radioactivewasp.videogamerecords.model.data.Platform

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 *
 * TODO: Replace all uses of this class before publishing your app.
 */
object DummyContent {
    val items: List<Game> = listOf(
        Game(
            "Mass Effect",
            "Cover",
            InvolvedCompany("Bioware", "RPG developer"),
            "Game with commander Sheppard",
            9.0,
            "Blablabla",
            Platform("XBOX")
        ),
        Game(
            "Half Life",
            "Cover",
            InvolvedCompany("Valve", "Steam owner"),
            "Game with Gordon Freeman",
            9.8,
            "Blablabla G-MAN blablabla",
            Platform("PC")
        )
    )
}