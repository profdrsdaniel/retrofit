package com.example.retrofit.ui.adapter

import androidx.recyclerview.widget.DiffUtil
import com.example.retrofit.data.model.Character

class CharacterDiffCallback : DiffUtil.ItemCallback<Character>() {
    override fun areItemsTheSame(oldItem: Character, newItem: Character): Boolean {
        return oldItem.name == newItem.name
    }

    override fun areContentsTheSame(oldItem: Character, newItem: Character): Boolean {
        return oldItem == newItem
    }
}