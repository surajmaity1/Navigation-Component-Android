package com.surajmyt.navigationcomponentandroid.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.surajmyt.navigationcomponentandroid.FragmentOne
import com.surajmyt.navigationcomponentandroid.FragmentThree
import com.surajmyt.navigationcomponentandroid.FragmentTwo
import com.surajmyt.navigationcomponentandroid.R

class ViewPagerFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_view_pager, container, false)

        val fragmentList = arrayListOf<Fragment>(
            FragmentOne(),
            FragmentTwo(),
            FragmentThree()
        )

        val adapter = ViewPagerAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )

        val viewpager: ViewPager2 = view.findViewById(R.id.viewPager)

        viewpager.adapter = adapter

        return view
    }
}