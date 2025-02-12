package com.example.retrofit.ui.adapter

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.retrofit.data.model.Character
import com.example.retrofit.databinding.CharacterItemListBinding

class CharacterViewHolder(
    private val binding: CharacterItemListBinding,
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(character: Character) {
        binding.character = character

        Glide.with(binding.root).load(character.image).into(binding.avatar)
    }
}