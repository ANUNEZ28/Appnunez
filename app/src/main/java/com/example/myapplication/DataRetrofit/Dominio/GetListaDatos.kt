package com.example.myapplication.DataRetrofit.Dominio

import com.example.myapplication.DataRetrofit.Entity.entiesCharacter
import retrofit2.Call
import retrofit2.http.GET

interface GetListaDatos {
    //https://rickandmortyapi.com/api/

    @GET("character")
    fun getCharacters() : Call<entiesCharacter>

    //agregar funcion para
    // get Character
    // https://rickandmortyapi.com/api/character/2

}