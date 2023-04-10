package com.surajmyt.navigationcomponentandroid

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.navArgs
import androidx.viewpager2.widget.ViewPager2

class FragmentTwo : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_two, container, false)

        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)

        val nextButton2 = view.findViewById<TextView>(R.id.next2)

        nextButton2.setOnClickListener {
            viewPager?.currentItem = 2
        }
        return view
    }

}