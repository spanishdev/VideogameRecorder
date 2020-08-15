package com.radioactivewasp.videogamerecords.gamelist

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.radioactivewasp.videogamerecords.gamelist.ui.GameListItem
import com.radioactivewasp.videogamerecords.gamelist.ui.toGameItem
import com.radioactivewasp.videogamerecords.model.data.Game
import com.radioactivewasp.videogamerecords.model.repository.GameRepository
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.schedulers.Schedulers

class GameListViewModel(private val repository: GameRepository) : ViewModel() {
    private val compositeDisposable: CompositeDisposable = CompositeDisposable()
    val gameData: MutableLiveData<List<GameListItem>> = MutableLiveData()

    fun requestGames() = compositeDisposable.add(
        repository
            .retrieveGames()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(::onGamesReceived, ::onErrorReceived)
    )

    private fun onGamesReceived(list: List<Game>) {
        gameData.postValue(list.map(Game::toGameItem))
    }

    private fun onErrorReceived(throwable: Throwable) {
        //TODO: TBD
    }

    override fun onCleared() {
        compositeDisposable.clear()
        super.onCleared()
    }

}