package com.greenovator.kotlin_assignment.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import com.greenovator.kotlin_assignment.R
import com.greenovator.kotlin_assignment.data.vos.Movies
import com.greenovator.kotlin_assignment.delegate.MovieDelegate
import com.greenovator.kotlin_assignment.viewholders.MovieViewHolder

class MovieListAdapter(private val delegate: MovieDelegate): BaseAdapter<MovieViewHolder, Movies>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.movies_list,parent,false);
        return MovieViewHolder(view,delegate);
    }
}