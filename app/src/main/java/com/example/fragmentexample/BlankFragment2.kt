package com.example.fragmentexample

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView


class BlankFragment2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view2:View=inflater.inflate(R.layout.fragment_blank2, container, false)
        var imade3:ImageView=view2.findViewById(R.id.imageviewblank2)
        imade3.setOnClickListener {
            var intent:Intent=Intent(requireActivity(),MainActivity::class.java)
            startActivity(intent)
        }
        return view2

    }

}