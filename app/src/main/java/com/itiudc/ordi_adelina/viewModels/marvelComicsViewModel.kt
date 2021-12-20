package com.itiudc.ordi_adelina.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.itiudc.ordi_adelina.models.character
import com.itiudc.ordi_adelina.services.marvelServices
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class marvelComicsViewModel : ViewModel() {
    private var _characters = MutableLiveData<MutableList<character>>()
    val characters: LiveData<MutableList<character>>
        get() = _characters

    init {
        viewModelScope.launch {
            _characters.value = fetch()
        }
    }
    private suspend fun fetch(): MutableList<character>{
        return withContext(Dispatchers.IO){
            val character: MutableList<character> = marvelServices.getCharacters().data.results
            character
        }
    }
}