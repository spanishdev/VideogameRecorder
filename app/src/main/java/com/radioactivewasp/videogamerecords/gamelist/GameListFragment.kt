package com.radioactivewasp.videogamerecords.gamelist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.observe
import androidx.recyclerview.widget.LinearLayoutManager
import com.radioactivewasp.videogamerecords.R
import com.radioactivewasp.videogamerecords.databinding.ItemListBinding
import com.radioactivewasp.videogamerecords.gamelist.ui.GameListAdapter
import com.radioactivewasp.videogamerecords.gamelist.ui.GameListItem
import com.radioactivewasp.videogamerecords.model.data.Game

/**
 * A fragment representing a single Item detail screen.
 * This fragment is either contained in a [GameListActivity]
 * in two-pane mode (on tablets) or a [MainActivity]
 * on handsets.
 */
class GameListFragment : Fragment(R.layout.item_list) {

    private lateinit var binding: ItemListBinding
    private val viewModel by viewModels<GameListViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ItemListBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecyclerView()
        viewModel.gameData.observe(requireActivity(), ::onGameDataChanged)
        viewModel.requestGames()
    }

    private fun initRecyclerView() {
        binding.recyclerView.apply {
            layoutManager =
                LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)

            adapter = GameListAdapter()
        }
    }

    private fun onGameDataChanged(list: List<GameListItem>) {
        (binding.recyclerView.adapter as GameListAdapter).list = list
    }

    companion object {
        fun newInstance() = GameListFragment()
    }
}