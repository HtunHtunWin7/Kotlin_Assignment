package com.greenovator.kotlin_assignment.network.dataagents

import com.greenovator.kotlin_assignment.data.vos.Movies
import com.greenovator.kotlin_assignment.network.response.MoviesApi
import com.greenovator.kotlin_assignment.network.response.MoviesResponse
import com.greenovator.kotlin_assignment.utils.BASE_URL
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.security.auth.callback.Callback

object RetrofitDataAgentImp: PhotoDataAgent {
    private val moviesApi : MoviesApi
    override fun getEvents(
        accessToken: String,
        onSuccess: (List<Movies>) -> Unit,
        onFailure: (String) -> Unit
    ) {
        val call = moviesApi.getAllMovies(accessToken)
        call.enqueue(object : retrofit2.Callback<MoviesResponse> {
            override fun onResponse(
                call: Call<MoviesResponse>,
                response: Response<MoviesResponse>
            ) {
                val eventsResponse =response.body()
                if (eventsResponse != null) {
                    if (eventsResponse.data!=null){
                        onSuccess(eventsResponse.data)
                    } else{
                        onFailure(eventsResponse.message)
                    }
                }
            }

            override fun onFailure(call: Call<MoviesResponse>, t: Throwable) {

            }
        })
    }
    init {
        val okHttpClient = OkHttpClient.Builder()
            .connectTimeout(15, TimeUnit.SECONDS)
            .readTimeout(60, TimeUnit.SECONDS)
            .writeTimeout(60, TimeUnit.SECONDS)
            .build()

        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        moviesApi = retrofit.create(MoviesApi::class.java)

    }
}

