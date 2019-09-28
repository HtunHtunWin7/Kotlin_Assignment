package com.greenovator.kotlin_assignment.data.model

import com.greenovator.kotlin_assignment.data.vos.Movies
import com.greenovator.kotlin_assignment.utils.PARAM_ACCESS_TOKEN

object MoviesModelImp : BaseModel(), MoviesModel {
    override fun getMovies(onSuccess: (List<Movies>) -> Unit, onFailure: (String) -> Unit) {
         val moviesFromDB = database.moviesDao().getAllMovies()
         if (moviesFromDB.isNotEmpty()) {
             onSuccess(moviesFromDB)
         } else {
             mdataAgent.getEvents(
                 PARAM_ACCESS_TOKEN,
                 {
                     database.moviesDao().insertMovies(it)
                     onSuccess(it)
                 }, onFailure
             )
         }
    }
}
