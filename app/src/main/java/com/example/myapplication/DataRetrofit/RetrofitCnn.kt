package com.example.myapplication.DataRetrofit

import com.example.myapplication.DataRetrofit.Dominio.GetListaDatos
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitCnn {
    val retrofit  = Retrofit.Builder().apply {
        baseUrl("https://rickandmortyapi.com/api/")
        addConverterFactory(GsonConverterFactory.create())
    }.build()

    val apiService = retrofit.create(GetListaDatos::class.java)

}