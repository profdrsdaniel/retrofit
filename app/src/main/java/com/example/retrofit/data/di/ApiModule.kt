package com.example.retrofit.data.di

import com.example.retrofit.data.CharacterRepository
import com.example.retrofit.data.remote.CharacterDataSource
import com.example.retrofit.data.remote.CharacterService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ApiModule {

    @Provides
    @Singleton
    fun provideApiService(): CharacterService =
        Retrofit.Builder()
            .baseUrl("https://rickandmortyapi.com/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CharacterService::class.java)

    @Provides
    fun provideRemoteDataSource(characterService: CharacterService): CharacterDataSource =
        CharacterDataSource(characterService)

    @Provides
    fun provideCharacterRepository(remoteDataSource: CharacterDataSource): CharacterRepository =
        CharacterRepository(remoteDataSource)
}