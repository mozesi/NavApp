package com.kauzgana.navapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.kauzgana.navapp.R
import com.kauzgana.navapp.databinding.FragmentItemsBinding

class ItemsFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val bindingObj = DataBindingUtil.inflate<FragmentItemsBinding>(inflater,R.layout.fragment_items,container,false)
        return bindingObj.root
    }


}