package com.radioactivewasp.videogamerecords.gamelist.ui

import com.radioactivewasp.videogamerecords.model.data.Game

sealed class GameListItem {
    object LoadingItem : GameListItem()
    data class GameItem(val game: Game) : GameListItem()
}

fun Game.toGameItem(): GameListItem.GameItem = GameListItem.GameItem(this)