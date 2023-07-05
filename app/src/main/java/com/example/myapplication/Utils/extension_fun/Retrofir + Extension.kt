package com.example.myapplication.Utils.extension_fun


import com.example.myapplication.DataRetrofit.Entity.Result
import com.example.myapplication.recycler.data.myUserItem

fun List<Result>.toUserItemList():List<myUserItem>{

    val userItemList = mutableListOf<myUserItem>()

    this.forEach {
        userItemList.add(it.toUserItem())
    }

    return userItemList

}