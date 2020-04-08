package com.avp.example.simpleprojectdagger.model

import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("info")
    val info: Info?,
    @SerializedName("results")
    val results: List<Result>
)