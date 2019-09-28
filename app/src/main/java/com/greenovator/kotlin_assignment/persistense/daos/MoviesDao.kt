package com.greenovator.kotlin_assignment.persistense.daos

import androidx.room.*
import com.greenovator.kotlin_assignment.data.vos.Movies
import com.greenovator.kotlin_assignment.persistense.typeconverters.GenreTypeConverter

@Dao
abstract class MoviesDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract fun insertMovies(movies: List<Movies>): LongArray

    @Query("SELECT * FROM movies")
    abstract fun getAllMovies(): List<Movies>

    @Query("SELECT * FROM movies WHERE id= :id")
    abstract fun findById(id: Int): Movies

    fun areMoviesExistedInDB(): Boolean {
        return getAllMovies().isNotEmpty()
    }
}