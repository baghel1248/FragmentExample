package com.example.fragmentexample

import android.media.Image
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction


class BlankFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view:View=inflater.inflate(R.layout.fragment_blank, container, false)
        var image:ImageView=view.findViewById(R.id.imageview1)
        image.setOnClickListener {
            var fragmentmanager: FragmentManager =requireActivity().supportFragmentManager
            var fragmenttransaction: FragmentTransaction =fragmentmanager.beginTransaction()
            fragmenttransaction.replace(R.id.mainlayout,BlankFragment2())
            fragmenttransaction.commit()

        }

        return view
    }

}