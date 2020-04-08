package com.avp.example.simpleprojectdagger.model

import com.google.gson.annotations.SerializedName

data class Location(
    @SerializedName("city")
    val city: String?,
    @SerializedName("coordinates")
    val coordinates: Coordinates?,
    @SerializedName("postcode")
    val postcode: String?,
    @SerializedName("state")
    val state: String?,
    @SerializedName("street")
    val street: String?,
    @SerializedName("timezone")
    val timezone: Timezone?
)