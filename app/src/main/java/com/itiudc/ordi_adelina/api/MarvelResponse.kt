package com.itiudc.ordi_adelina.api

class MarvelResponse<T>(
    val data: Results<T>){
}

class Results<T>(
    val results: T
){

}