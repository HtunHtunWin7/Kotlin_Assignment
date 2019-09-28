package com.greenovator.kotlin_assignment.persistense.daos

import android.content.Context
import androidx.room.*
import com.greenovator.kotlin_assignment.data.vos.Movies
import com.greenovator.kotlin_assignment.persistense.typeconverters.GenreTypeConverter
import com.greenovator.kotlin_assignment.utils.MOVIES_DB

@Database(entities = [Movies::class], version = 5, exportSchema = false)
@TypeConverters(GenreTypeConverter::class)
abstract class MoviesDatabase : RoomDatabase() {
    abstract fun moviesDao(): MoviesDao

    companion object {
        private var instance: MoviesDatabase?= null

        fun getInstance(context: Context): MoviesDatabase {
            if (instance == null) {
                instance = Room.databaseBuilder(context, MoviesDatabase::class.java, MOVIES_DB)
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build()
            }
            val db = instance!!
            return db
        }
    }
}







