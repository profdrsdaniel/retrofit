package com.example.retrofit.ui.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.retrofit.R
import com.example.retrofit.databinding.FragmentCharactersBinding
import com.example.retrofit.ui.adapter.CharacterAdapter
import com.example.retrofit.ui.utils.Result
import com.example.retrofit.ui.viewmodel.CharacterViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CharactersFragment : Fragment() {
    private lateinit var binding: FragmentCharactersBinding
    private lateinit var adapter: CharacterAdapter
    private val characterViewModel: CharacterViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCharactersBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val rc = binding.recyclerView
        adapter = CharacterAdapter()

        rc.adapter = adapter
        characterViewModel.characters.observe(viewLifecycleOwner) { result ->
            when(result) {
                is Result.Error -> Log.i("ERROR", "ERROR")
                Result.Loading -> {
                    binding.recyclerView.visibility = View.GONE
                    binding.loading.visibility = View.VISIBLE
                }
                is Result.Success -> {
                    adapter.submitList(result.data)
                    binding.recyclerView.visibility = View.VISIBLE
                    binding.loading.visibility = View.GONE
                }
            }

        }

    }
}