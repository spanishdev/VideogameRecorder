package com.radioactivewasp.videogamerecords.gamedetail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.TextView
import com.radioactivewasp.videogamerecords.R
import com.radioactivewasp.videogamerecords.model.data.Game

/**
 * A fragment representing a single Item detail screen.
 * This fragment is either contained in a [GameListActivity]
 * in two-pane mode (on tablets) or a [MainActivity]
 * on handsets.
 */
class GameDetailFragment : Fragment(R.layout.item_detail) {

    /**
     * The dummy content this fragment is presenting.
     */
    private var item: Game? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        item?.let {
            view.findViewById<TextView>(R.id.item_detail).text = item?.summary.orEmpty()
        }
    }

    companion object {
        const val ARG_ITEM_ID = "item_id"

        fun newInstance() = GameDetailFragment()
    }
}