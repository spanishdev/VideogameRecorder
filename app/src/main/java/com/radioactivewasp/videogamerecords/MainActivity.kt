package com.radioactivewasp.videogamerecords

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
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
        setContentView(R.layout.activity_item_list)
        setSupportActionBar(findViewById(R.id.toolbar))

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own detail action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

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