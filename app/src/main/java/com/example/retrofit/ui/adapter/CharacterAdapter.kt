package com.example.retrofit.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.retrofit.data.model.Character
import com.example.retrofit.databinding.CharacterItemListBinding

class CharacterAdapter : ListAdapter<Character, CharacterViewHolder>(CharacterDiffCallback()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
        val binding =
            CharacterItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CharacterViewHolder(
            binding = binding
        )
    }

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}