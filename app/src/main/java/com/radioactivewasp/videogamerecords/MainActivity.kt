package com.radioactivewasp.videogamerecords

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.radioactivewasp.videogamerecords.gamedetail.GameDetailFragment
import com.radioactivewasp.videogamerecords.gamelist.GameListFragment

/**
 * An activity representing a single Item detail screen. This
 * activity is only used on narrow width devices. On tablet-size devices,
 * item details are presented side-by-side with a list of items
 * in a [GameListActivity].
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))


        // Show the Up button in the action bar.
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        loadListFragment()
    }

    fun loadListFragment() = loadFragment(GameListFragment.newInstance())

    fun loadDetailFragment(itemID: Int) = loadFragment(
        GameDetailFragment.newInstance().apply {
            arguments = Bundle().apply {
                putString(
                    GameDetailFragment.ARG_ITEM_ID,
                    intent.getStringExtra(GameDetailFragment.ARG_ITEM_ID)
                )
            }
        }
    )

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.content, fragment)
            .commit()
    }
}