package com.greenovator.kotlin_assignment.data.vos

import androidx.room.*
import com.google.gson.annotations.SerializedName

@Entity(tableName = "movies")
class Movies(
    @PrimaryKey
    @SerializedName("id" )
    @ColumnInfo(name = "id")
    val movieId: Int,
    @SerializedName("movie_name")
    @ColumnInfo(name = "movie_name")
    val movieName: String,
    @SerializedName("imdb")
    @ColumnInfo(name = "imdb")
    val imDB: Double,
    @SerializedName("rotten_tomato")
    @ColumnInfo(name = "rotten_tomato")
    val rottenTomato: Int,
    @SerializedName("meta_centric")
    @ColumnInfo(name = "meta_centric")
    val metaCentric: Int,
    @SerializedName("genre")
    val genre: List<Genre>,
    @SerializedName("overview")
    @ColumnInfo(name = "overview")
    val overview: String,
    @SerializedName("poster")
    @ColumnInfo(name = "poster")
    val posterUri:String
)
