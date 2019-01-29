package com.example.admin.daggervskoin.dagger

import javax.inject.Inject

class NetWorkApi @Inject constructor(){
    fun validateUser(userName: String, password: String) : Boolean{
        return !userName.isEmpty()
    }
}