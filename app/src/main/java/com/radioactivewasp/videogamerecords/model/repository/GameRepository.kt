package com.radioactivewasp.videogamerecords.model.repository

import com.radioactivewasp.videogamerecords.dummy.DummyContent
import com.radioactivewasp.videogamerecords.model.data.Game
import io.reactivex.rxjava3.core.Single

class GameRepository {
    fun retrieveGames(): Single<List<Game>> = Single.just(DummyContent.items)
}