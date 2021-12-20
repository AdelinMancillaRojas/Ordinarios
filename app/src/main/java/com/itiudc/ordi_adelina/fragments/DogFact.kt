package com.itiudc.ordi_adelina.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.itiudc.ordi_adelina.databinding.FragmentDogFactBinding
import com.itiudc.ordi_adelina.models.dogFact
import com.itiudc.ordi_adelina.viewModels.dogFactViewModel

class DogFact : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val quoteViewModel = ViewModelProvider(this).get(dogFactViewModel::class.java)
        var binding = FragmentDogFactBinding.inflate(inflater, container, false)

        quoteViewModel.quote.observe(viewLifecycleOwner, Observer<MutableList<dogFact>>{
                dogFact ->

            binding.dogFact.text = dogFact[0].fact
        })

        binding.root.setOnClickListener(){
            quoteViewModel.newFact()
        }

        return binding.root
    }

    override fun onPause() {
        super.onPause()
        val quoteViewModel = ViewModelProvider(this).get(dogFactViewModel::class.java)
        quoteViewModel.newFact()
    }
}