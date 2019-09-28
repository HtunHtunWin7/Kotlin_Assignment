package com.greenovator.kotlin_assignment.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.greenovator.kotlin_assignment.R
import com.greenovator.kotlin_assignment.utils.EXTRA_TO_EXTRA

class DetailActivity : BaseActivity(){
    fun newIntent(context: Context,moviesIdExtra: Int):Intent{
        val intent = Intent(context,DetailActivity::class.java)
        intent.putExtra(EXTRA_TO_EXTRA,moviesIdExtra)
        return intent
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.details_movie)
    }

}

