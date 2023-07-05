package com.example.myapplication.recycler.data


data class myUserItem(
    val name : String = "Sin nombre",
    val origen : Origen= Origen(),
    val typePerson: String ="Empty",
    val imageURLValue : String = "Empty",

    )
data class  Origen(
    val name: String="Empty",
    val url: String ="Empty"
)