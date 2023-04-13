package com.surajmyt.navigationcomponentandroid

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.surajmyt.navigationcomponentandroid.model.User

class FragmentOne : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_one, container, false)

        val btn = view.findViewById<Button>(R.id.bottom_sheet_btn)

        btn.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFrag_to_bottomSheetFrag)
        }

        return view
    }

}