package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment(){


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)

    }

    override fun onStart() {
        super.onStart()
        configureButtonClick()
    }

    fun configureButtonClick(){
        buttomNavigate.setOnClickListener {
            val action = MainFragmentDirections.mainToDestination1(5)
            findNavController().navigate(action)
        }
    }


}