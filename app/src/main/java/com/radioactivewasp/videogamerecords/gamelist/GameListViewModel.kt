package com.radioactivewasp.videogamerecords.gamelist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.radioactivewasp.videogamerecords.dummy.DummyContent
import com.radioactivewasp.videogamerecords.gamelist.ui.GameListItem
import com.radioactivewasp.videogamerecords.gamelist.ui.toGameItem
import com.radioactivewasp.videogamerecords.model.data.Game

class GameListViewModel: ViewModel() {
    val gameData: MutableLiveData<List<GameListItem>> = MutableLiveData()

    fun requestGames() {
        gameData.postValue(DummyContent.items.map(Game::toGameItem))
    }
}