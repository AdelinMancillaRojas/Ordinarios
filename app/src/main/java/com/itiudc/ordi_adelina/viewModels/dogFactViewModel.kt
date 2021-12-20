package com.itiudc.ordi_adelina.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.itiudc.ordi_adelina.models.dogFact
import com.itiudc.ordi_adelina.services.dogFactServices
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class dogFactViewModel : ViewModel() {
    private var _quote = MutableLiveData<MutableList<dogFact>>()
    val quote: LiveData<MutableList<dogFact>>
        get() = _quote

    init {
        viewModelScope.launch {
            _quote.value = fetch()
        }
    }

    private suspend fun fetch(): MutableList<dogFact>{
        return withContext(Dispatchers.IO){
            val quotes: MutableList<dogFact> = dogFactServices.getDogFact()
            quotes
        }
    }

    fun newFact(){
        viewModelScope.launch {
            _quote.value = fetch()
        }
    }
}