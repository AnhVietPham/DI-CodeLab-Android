package com.avp.example.simpleprojectdagger.model

import com.google.gson.annotations.SerializedName

data class Dob(
    @SerializedName("age")
    val age: Int?,
    @SerializedName("date")
    val date: String?
)