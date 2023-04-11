package com.surajmyt.navigationcomponentandroid

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class DashBoardFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_dash_board, container, false)

        val btnToFrag1 = view.findViewById<Button>(R.id.to_frag1_btn)
        val btnToFrag2 = view.findViewById<Button>(R.id.to_frag2_btn)

        btnToFrag1.setOnClickListener {
            findNavController().navigate(R.id.action_dashboardFragment_to_fragOne)
        }

        btnToFrag2.setOnClickListener {
            findNavController().navigate(R.id.action_dashboardFragment_to_fragTwo)
        }

        return view
    }
}