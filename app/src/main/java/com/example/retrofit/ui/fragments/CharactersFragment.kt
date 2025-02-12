package com.example.retrofit.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.retrofit.R
import com.example.retrofit.ui.adapter.CharacterAdapter
import com.example.retrofit.ui.viewmodel.CharacterViewModel

class CharactersFragment : Fragment() {
    private lateinit var binding: Fragment
    private lateinit var adapter: CharacterAdapter
    private val todoViewModel: CharacterViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_characters, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}