package com.example.retrofit.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.retrofit.data.CharacterRepository
import com.example.retrofit.data.model.Character
import com.example.retrofit.ui.utils.Result
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class CharacterViewModel @Inject constructor(private val repository: CharacterRepository) :
    ViewModel() {
    private val _characters = MutableLiveData<Result<List<Character>>>()
    val characters = _characters

    init {
        fetchCharacters()
    }

    private fun fetchCharacters() {
        _characters.value = Result.Loading

        viewModelScope.launch(Dispatchers.IO) {
            val characters = repository.fetchCharacters()
            withContext(Dispatchers.Main) {
                _characters.value = Result.Success(characters)
            }
        }
    }
}