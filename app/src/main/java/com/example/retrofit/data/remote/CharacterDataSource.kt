package com.example.retrofit.data.remote

import com.example.retrofit.data.remote.response.CharacterResponse
import javax.inject.Inject

class CharacterDataSource @Inject constructor(private val characterService: CharacterService) {
    suspend fun fetchCharacters(): List<CharacterResponse> {
        return characterService.getCharacters().characterResponse
    }
}