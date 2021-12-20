package com.itiudc.ordi_adelina.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

var api2 =
    Retrofit
        .Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl("https://dog-facts-api.herokuapp.com/api/v1/resources/")
        .build()