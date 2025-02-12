package com.example.retrofit.data.remote

import com.example.retrofit.data.remote.response.ResultCharacterResponse
import retrofit2.http.GET

interface CharacterService {
    @GET("character")
    suspend fun getCharacters(): ResultCharacterResponse
}