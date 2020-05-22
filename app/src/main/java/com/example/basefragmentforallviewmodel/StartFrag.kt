package com.example.basefragmentforallviewmodel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.basefragmentforallviewmodel.databinding.FragmentStartBinding

/**
 * A simple [Fragment] subclass.
 */
class StartFrag : BaseFragment<FragmentStartBinding,Viewmodel>() {

    override fun getFragmentView() = R.layout.fragment_start


    override fun getVieModel() = Viewmodel::class.java

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        binding.text.text="Hello Base Fragment"
    }


}
