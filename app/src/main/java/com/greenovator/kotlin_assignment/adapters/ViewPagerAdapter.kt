package com.greenovator.kotlin_assignment.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.greenovator.kotlin_assignment.fragment.FragmentOne
import com.greenovator.kotlin_assignment.fragment.FragmentTwo


class ViewPagerAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return if (position == 0)
            FragmentOne()
        else
            FragmentTwo()
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence? {
         if (position == 0)
           return "Now Showing"
         else if (position == 1)
           return "Cinema"
        else
            return "Tomorrow"
    }
}