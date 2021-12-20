package com.itiudc.ordi_adelina.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

var api =
    Retrofit
        .Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl("https://gateway.marvel.com/v1/public/")
        .build()