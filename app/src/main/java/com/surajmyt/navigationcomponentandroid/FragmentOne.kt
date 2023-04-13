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

        val sendBtn = view.findViewById<Button>(R.id.frag1_send_btn)

        sendBtn.setOnClickListener {
            val firstName = view.findViewById<EditText>(R.id.firstName).text.toString()
            val lastName = view.findViewById<EditText>(R.id.lastName).text.toString()

            val user = User(firstName, lastName)
            val action = FragmentOneDirections.navigateToFragTwo(user)
            findNavController().navigate(action)
        }

        return view
    }

}