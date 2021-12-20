package com.itiudc.ordi_adelina.services

import com.itiudc.ordi_adelina.api.MarvelResponse
import com.itiudc.ordi_adelina.api.api
import com.itiudc.ordi_adelina.models.character
import retrofit2.http.GET

interface MarvelService {
    @GET("characters?ts=1&apikey=773cdc7a4e8f7fd7a7919be6ba08dec1&hash=5d47ef020b11acd8d21eed6bb2e1948f")
    suspend fun getCharacters(): MarvelResponse<MutableList<character>>
}

var marvelServices: MarvelService = api.create<MarvelService>(MarvelService::class.java)