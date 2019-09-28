package com.greenovator.kotlin_assignment

import android.app.Application
import com.greenovator.kotlin_assignment.data.model.MoviesModelImp

class MoviesApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        MoviesModelImp.initDatabase(this)
    }
}