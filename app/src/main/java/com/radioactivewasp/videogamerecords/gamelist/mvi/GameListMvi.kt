package com.radioactivewasp.videogamerecords.gamelist.mvi

import com.radioactivewasp.videogamerecords.model.data.Game

data class MviState(
    val refreshLoading: Boolean = false,
    val paginationLoading: Boolean = false,
    val itemList: List<Game> = emptyList(),
    val errorMessage: String? = null
)

