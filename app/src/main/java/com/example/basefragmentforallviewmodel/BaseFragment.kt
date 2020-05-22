package com.example.basefragmentforallviewmodel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

/**
 * A simple [Fragment] subclass.
 */
abstract class BaseFragment<v : ViewDataBinding,vm : ViewModel> : Fragment() {

    protected  lateinit var binding : v
    protected  lateinit var viewModel :vm


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= DataBindingUtil.inflate(
            inflater,
            getFragmentView(),
            container,
            false
        )
        viewModel=ViewModelProvider(this).get(getVieModel())

        // Inflate the layout for this fragment
        return binding.root
    }

    abstract fun getFragmentView():Int
   abstract fun getVieModel() : Class<vm>
}
