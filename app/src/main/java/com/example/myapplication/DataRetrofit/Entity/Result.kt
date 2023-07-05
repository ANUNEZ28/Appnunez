package com.example.myapplication.DataRetrofit.Entity

import com.example.myapplication.recycler.data.Origen
import com.example.myapplication.recycler.data.myUserItem

data class Result(
    val created: String,
    val episode: List<String>,
    val gender: String,
    val id: Int,
    val image: String,
    val location: Location,
    val name: String,
    val origin: Origin,
    val species: String,
    val status: String,
    val type: String,
    val url: String
)
{
    fun toUserItem():myUserItem{

          val Origen    = Origen(
               name= this.name,
              url= this.url

          )

        return myUserItem(
            name = this.name,
            typePerson = this.type,
            imageURLValue = this.image,
            origen =  Origen
        )

    }

}