package com.greenovator.kotlin_assignment.network.response

import com.greenovator.kotlin_assignment.utils.GET_MOVIES
import com.greenovator.kotlin_assignment.utils.PARAM_ACCESS_TOKEN
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface MoviesApi {
    @POST(GET_MOVIES)
    @FormUrlEncoded
    fun getAllMovies(@Field(PARAM_ACCESS_TOKEN)acceessToken: String): Call<MoviesResponse>
}