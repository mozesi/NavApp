package com.kauzgana.navapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.kauzgana.navapp.R
import com.kauzgana.navapp.databinding.FragmentHomeBinding


/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val bindingObj = DataBindingUtil.inflate<FragmentHomeBinding>(inflater,R.layout.fragment_home,container,false)
        bindingObj.detailsButton.setOnClickListener{ view:View ->
            view.findNavController().navigate(R.id.action_homeFragment_to_detailsFragment)
        }
        bindingObj.itemsButton.setOnClickListener{view:View->
            view.findNavController().navigate(R.id.action_homeFragment_to_contactFragment)
        }
        return bindingObj.root
    }


}