package com.radioactivewasp.videogamerecords.gamelist.ui

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer

class GameListAdapter(private val list: List<GameListItem>) : RecyclerView.Adapter<GameListAdapter.GameViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: GameViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    inner class GameViewHolder(override val containerView: View) :
        RecyclerView.ViewHolder(containerView), LayoutContainer {

    }
}