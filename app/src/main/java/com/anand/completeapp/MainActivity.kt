package com.anand.completeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //navcontroller
        //
//        val navController = NavHostFragment.findNavController(nav_host_fragment)
//        navController.addOnDestinationChangedListener { controller, destination, arguments ->
//
//            textView.text = destination.label
//
//        }

        //viewmodel, live data
        //services

        //activity -> fragment (supportFragmentMnagaer), -> fragment ()

    }

}
