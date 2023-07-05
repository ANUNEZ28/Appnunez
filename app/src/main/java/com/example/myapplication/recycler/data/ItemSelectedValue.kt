package com.example.myapplication.recycler.data

object ItemSelectedValue {

    private var userItemSelected = myUserItem()

    init {
        userItemSelected = myUserItem()
    }

    fun clearUser() {
        userItemSelected = myUserItem()
    }

    fun selectUser(user : myUserItem){
        userItemSelected = user
    }

    fun getUser() = userItemSelected

}