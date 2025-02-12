package com.example.retrofit.data.remote.response

import com.google.gson.annotations.SerializedName

data class LocationCharacterResponse(
    @SerializedName("name")
    val name: String
)
