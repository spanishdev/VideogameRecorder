package com.radioactivewasp.videogamerecords.gamelist

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.radioactivewasp.videogamerecords.gamelist.ui.GameListItem
import com.radioactivewasp.videogamerecords.gamelist.ui.toGameItem
import com.radioactivewasp.videogamerecords.model.data.Game
import com.radioactivewasp.videogamerecords.model.repository.GameRepository

class GameListViewModel(private val repository: GameRepository): ViewModel() {
    val gameData: MutableLiveData<List<GameListItem>> = MutableLiveData()

    fun requestGames() = repository.retrieveGames().apply {
        gameData.postValue(map(Game::toGameItem))
    }
}