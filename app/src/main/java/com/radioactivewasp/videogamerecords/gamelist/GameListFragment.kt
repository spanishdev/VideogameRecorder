package com.radioactivewasp.videogamerecords.gamelist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.radioactivewasp.videogamerecords.R
import com.radioactivewasp.videogamerecords.dummy.DummyContent

/**
 * A fragment representing a single Item detail screen.
 * This fragment is either contained in a [GameListActivity]
 * in two-pane mode (on tablets) or a [MainActivity]
 * on handsets.
 */
class GameListFragment : Fragment(R.layout.item_list) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    companion object {
        const val ARG_ITEM_ID = "item_id"

        fun newInstance() = GameListFragment()
    }
}