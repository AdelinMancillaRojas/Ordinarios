package com.itiudc.ordi_adelina.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.itiudc.ordi_adelina.viewModels.marvelComicsViewModel
import androidx.lifecycle.Observer
import com.itiudc.ordi_adelina.adapters.MarvelComicAdapter
import com.itiudc.ordi_adelina.databinding.FragmentMarvelCharactersBinding
import com.itiudc.ordi_adelina.models.character

class MarvelCharacters : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val marvelcharacterViewModel = ViewModelProvider(this).get(marvelComicsViewModel::class.java)
        val binding = FragmentMarvelCharactersBinding.inflate(inflater, container, false)

        marvelcharacterViewModel.characters.observe(viewLifecycleOwner, Observer<MutableList<character>>{
                characters ->
            val adapter = MarvelComicAdapter(characters)

            binding.recyclerCharacterList.layoutManager = LinearLayoutManager(requireActivity())
            binding.recyclerCharacterList.adapter = adapter
        })

        return binding.root
    }
}