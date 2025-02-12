package com.example.retrofit.data

import com.example.retrofit.data.mapper.convertToModel
import com.example.retrofit.data.model.Character
import com.example.retrofit.data.remote.CharacterDataSource
import javax.inject.Inject

class CharacterRepository @Inject constructor(private val characterDataSource: CharacterDataSource) {
    suspend fun fetchCharacters(): List<Character> {
        return characterDataSource.fetchCharacters()
            .map { characterResponse -> characterResponse.convertToModel() }
    }
}