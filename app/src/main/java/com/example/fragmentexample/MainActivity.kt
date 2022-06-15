package com.example.fragmentexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button1a:Button=findViewById(R.id.button1)
        button1a.setOnClickListener{
            var fragmentmanager:FragmentManager=supportFragmentManager
            var fragmenttransaction:FragmentTransaction=fragmentmanager.beginTransaction()
            fragmenttransaction.replace(R.id.mainlayout,BlankFragment())
            fragmenttransaction.commit()
        }
    }
}