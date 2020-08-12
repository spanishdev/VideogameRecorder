package com.radioactivewasp.videogamerecords.gamelist.ui

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.radioactivewasp.videogamerecords.databinding.ItemListContentBinding
import com.radioactivewasp.videogamerecords.databinding.ItemListLoadingBinding

sealed class GameAdapterViewHolder(view: View) : RecyclerView.ViewHolder(view)

class GameItemViewHolder(private val binding: ItemListContentBinding) :
    GameAdapterViewHolder(binding.root) {

    fun bindGameItem(item: GameListItem.GameItem) {
        with(item.game) {
            binding.name.text = name
            binding.summary.text = summary
        }
    }
}

class GameLoadingViewHolder(binding: ItemListLoadingBinding) : GameAdapterViewHolder(binding.root)


