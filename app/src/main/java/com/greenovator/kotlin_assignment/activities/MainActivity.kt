package com.greenovator.kotlin_assignment.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.snackbar.Snackbar
import com.greenovator.kotlin_assignment.R
import com.greenovator.kotlin_assignment.adapters.MovieListAdapter
import com.greenovator.kotlin_assignment.adapters.ViewPagerAdapter
import com.greenovator.kotlin_assignment.delegate.MovieDelegate
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity(), MovieDelegate {
    override fun movieDetailsDelegate(movieId: Int) {

            }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listAdapter = MovieListAdapter(this);

        with(recycler) {
            recycler.setHasFixedSize(true)
            recycler.layoutManager = LinearLayoutManager(applicationContext)
            recycler.adapter = listAdapter
        }
        model.getMovies(
            { movie ->
                listAdapter.setNewData(movie.toMutableList())
            }, {
                Snackbar.make(rootView, it, Snackbar.LENGTH_LONG).show()
            }
        )
        /*viewPage.adapter = ViewPagerAdapter(supportFragmentManager)
        tabLayout.setupWithViewPager(viewPage)*/
    }
}
