package com.example.admin.simpleproject.interfaces

import com.example.admin.simpleproject.model.User
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface RandomUsersApi {
    @GET("api")
    fun getRandomUsers(@Query("results") size: Int): Call<User>
}