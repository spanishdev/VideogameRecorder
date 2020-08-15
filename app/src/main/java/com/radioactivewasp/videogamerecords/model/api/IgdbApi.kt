package com.radioactivewasp.videogamerecords.model.api

import com.radioactivewasp.videogamerecords.model.data.GameDTO
import io.reactivex.rxjava3.core.Single
import retrofit2.http.POST

interface IgdbApi {
    @POST("games")
    fun requestGames(): Single<List<GameDTO>>
}