package com.greenovator.kotlin_assignment.network.response

import com.google.gson.annotations.SerializedName
import com.greenovator.kotlin_assignment.data.vos.Movies
import com.greenovator.kotlin_assignment.utils.CODE_RESPONSE_OK

data class MoviesResponse (
    @SerializedName("message")
    val message: String,
    @SerializedName("code")
    val code: Int,
    @SerializedName("data")
    val data: List<Movies>?
){
    fun isResponseOK():Boolean{
        return code == CODE_RESPONSE_OK && data != null
    }
}