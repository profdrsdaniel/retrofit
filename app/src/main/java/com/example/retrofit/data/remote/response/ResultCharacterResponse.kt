package com.example.retrofit.data.remote.response

import com.google.gson.annotations.SerializedName

data class ResultCharacterResponse(
    @SerializedName("results")
    val characterResponse: List<CharacterResponse>
)
