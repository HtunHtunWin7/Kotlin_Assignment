package com.greenovator.kotlin_assignment.activities

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.greenovator.kotlin_assignment.data.model.MoviesModel
import com.greenovator.kotlin_assignment.data.model.MoviesModelImp

abstract class BaseActivity: AppCompatActivity() {
    protected var model: MoviesModel =MoviesModelImp
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
}