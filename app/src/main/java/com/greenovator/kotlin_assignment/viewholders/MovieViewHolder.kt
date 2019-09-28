package com.greenovator.kotlin_assignment.viewholders

import android.view.View
import com.bumptech.glide.Glide
import com.greenovator.kotlin_assignment.data.vos.Movies
import com.greenovator.kotlin_assignment.delegate.MovieDelegate
import kotlinx.android.synthetic.main.movies_list.view.*

class MovieViewHolder(itemView: View,private val moviesDelegate: MovieDelegate):BaseViewHolder<Movies>(itemView) {

    init {
        itemView.setOnClickListener{
            val id = data?.movieId
            if (id != null)
            {
                moviesDelegate.movieDetailsDelegate(id)
            }
        }
    }
    override fun bindData(data: Movies) {
        itemView.text_imdb.text = data.imDB.toString()
        itemView.text_metacritic.text = data.metaCentric.toString()
        itemView.text_movieFilm.text = data.movieName
        itemView.text_movieTitle.text = data.movieName
        itemView.text_tomato.text = data.rottenTomato.toString()
        Glide.with(itemView)
            .load(data.posterUri)
            .into(itemView.imageMovie)

    }

}