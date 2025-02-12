package com.example.retrofit.data.remote.response

import com.google.gson.annotations.SerializedName

data class CharacterResponse(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("species")
    val species: String,
    @SerializedName("location")
    val location: LocationCharacterResponse,
    @SerializedName("image")
    val image: String
)
