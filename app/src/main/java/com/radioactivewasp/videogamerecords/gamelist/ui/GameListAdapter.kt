package com.radioactivewasp.videogamerecords.gamelist.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.radioactivewasp.videogamerecords.databinding.ItemListContentBinding
import com.radioactivewasp.videogamerecords.databinding.ItemListLoadingBinding

class GameListAdapter : RecyclerView.Adapter<GameAdapterViewHolder>() {

    var list: List<GameListItem> = emptyList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun getItemViewType(position: Int): Int = when (list[position]) {
        is GameListItem.GameItem -> GAME_TYPE
        GameListItem.LoadingItem -> LOADING_TYPE
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameAdapterViewHolder {
        val inflater: LayoutInflater =
            parent.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        return when (viewType) {
            GAME_TYPE -> {
                GameItemViewHolder(ItemListContentBinding.inflate(inflater, parent, false))
            }
            LOADING_TYPE -> {
                GameLoadingViewHolder(ItemListLoadingBinding.inflate(inflater, parent, false))
            }
            else -> throw IllegalArgumentException("ViewType not recognized")
        }
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: GameAdapterViewHolder, position: Int) {
        if (holder is GameItemViewHolder) holder.bindGameItem(list[position] as GameListItem.GameItem)
    }

    companion object {
        private const val GAME_TYPE = 0
        private const val LOADING_TYPE = 1
    }
}