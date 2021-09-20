package com.kauzgana.navapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.kauzgana.navapp.R
import com.kauzgana.navapp.databinding.FragmentContactBinding


/**
 * A simple [Fragment] subclass.
 * Use the [ContactFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ContactFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val bindingObj = DataBindingUtil.inflate<FragmentContactBinding>(inflater,R.layout.fragment_contact,container,false)
        return bindingObj.root
    }


}