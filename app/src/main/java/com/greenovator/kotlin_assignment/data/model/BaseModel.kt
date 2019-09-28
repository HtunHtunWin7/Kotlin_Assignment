package com.greenovator.kotlin_assignment.data.model

import android.content.Context
import com.greenovator.kotlin_assignment.network.dataagents.PhotoDataAgent
import com.greenovator.kotlin_assignment.network.dataagents.RetrofitDataAgentImp
import com.greenovator.kotlin_assignment.persistense.daos.MoviesDatabase

open class BaseModel{
    protected val mdataAgent: PhotoDataAgent = RetrofitDataAgentImp

    protected lateinit var database: MoviesDatabase
    fun initDatabase(cotext: Context){
        database = MoviesDatabase.getInstance(cotext)
    }

}

