package com.greenovator.kotlin_assignment.data.model

import android.hardware.camera2.CaptureFailure
import com.greenovator.kotlin_assignment.data.vos.Movies

interface MoviesModel {
    fun getMovies(
        onSuccess: (List<Movies>) -> Unit,
        onFailure: (String) -> Unit
    )
}