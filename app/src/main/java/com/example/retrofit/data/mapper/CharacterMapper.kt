package com.example.retrofit.data.mapper

import com.example.retrofit.data.model.Character
import com.example.retrofit.data.model.Location
import com.example.retrofit.data.remote.response.CharacterResponse
import com.example.retrofit.data.remote.response.LocationCharacterResponse

fun LocationCharacterResponse.toModel() = Location(name = this.name)
fun CharacterResponse.convertToModel() =
    Character(
        name = this.name,
        species = this.species,
        location = this.location.toModel(),
        image = this.image
    )