package com.itiudc.ordi_adelina.services

import com.itiudc.ordi_adelina.api.api2
import com.itiudc.ordi_adelina.api.response
import retrofit2.http.GET

interface dogFactService {
    @GET("dogs?number=1")
    suspend fun getDogFact(): response
}

var dogFactServices: dogFactService = api2.create<dogFactService>(dogFactService::class.java)