package com.radioactivewasp.videogamerecords.model.repository

import com.radioactivewasp.videogamerecords.dummy.DummyContent
import com.radioactivewasp.videogamerecords.model.data.Game

class GameRepository {
    fun retrieveGames(): List<Game> = DummyContent.items
}