package com.surajmyt.navigationcomponentandroid.onboarding

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(
    list: ArrayList<Fragment>,
    fragmentManager: FragmentManager,
    lifeCycle: Lifecycle
): FragmentStateAdapter(fragmentManager, lifeCycle)
{

    val fragmentList = list
    override fun getItemCount() = fragmentList.size

    override fun createFragment(position: Int) = fragmentList[position]

}