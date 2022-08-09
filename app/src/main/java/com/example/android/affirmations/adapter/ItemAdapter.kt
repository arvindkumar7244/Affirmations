package com.example.android.affirmations.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.android.affirmations.databinding.ListItemBinding
import com.example.android.affirmations.model.Affirmation

class ItemAdapter : ListAdapter<Affirmation, ItemAdapter.ItemViewHolder>(DiffCallback) {
    class ItemViewHolder(private val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Affirmation) {
            binding.affirmation=item
            binding.executePendingBindings()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view =
            ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }

    companion object DiffCallback : DiffUtil.ItemCallback<Affirmation>() {
        override fun areItemsTheSame(oldItem: Affirmation, newItem: Affirmation): Boolean {
            return newItem == oldItem
        }

        override fun areContentsTheSame(oldItem: Affirmation, newItem: Affirmation): Boolean {
            return newItem == oldItem
        }
    }
}
