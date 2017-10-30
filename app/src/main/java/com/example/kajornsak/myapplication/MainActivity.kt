package com.example.kajornsak.myapplication

import android.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(),UpdateTextInterface {

    override fun onTextUpdate(string: String) {
        supportFragmentManager.beginTransaction().replace(R.id.content_view,SecondFragment.newInstance(string)).addToBackStack("stack").commit()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().add(R.id.content_view,FirstFragment()).commit()
    }
}
