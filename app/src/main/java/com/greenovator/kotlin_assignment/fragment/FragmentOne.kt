package com.greenovator.kotlin_assignment.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.greenovator.kotlin_assignment.R
 class FragmentOne() : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?{
        val view: View
        view = layoutInflater.inflate(R.layout.movies_list,container,false)
        return view
    }

    companion object {
        fun newInstance(): FragmentOne {

            val args = Bundle()

            val fragment = FragmentOne()
            fragment.arguments = args
            return fragment
        }
    }
}