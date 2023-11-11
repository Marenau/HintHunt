package com.corylab.hinthunt.presentation.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.corylab.hinthunt.R
import com.corylab.hinthunt.data.model.WordCard


class WordCardAdapter : ListAdapter<WordCard, WordCardAdapter.WordCardViewHolder>(WordCardDiffCallback()) {

    class WordCardDiffCallback : DiffUtil.ItemCallback<WordCard>() {
        override fun areItemsTheSame(oldItem: WordCard, newItem: WordCard) =
            oldItem.word == newItem.word

        override fun areContentsTheSame(oldItem: WordCard, newItem: WordCard) = oldItem == newItem
    }

    class WordCardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private var btn: Button

        init {
            btn = itemView as Button
        }

        fun bind(card: WordCard) {
            btn.text = card.word
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordCardViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_button, parent, false)
        return WordCardViewHolder(view)
    }

    override fun onBindViewHolder(holder: WordCardViewHolder, position: Int) {
        val card = getItem(position)
        holder.bind(card)
    }
}