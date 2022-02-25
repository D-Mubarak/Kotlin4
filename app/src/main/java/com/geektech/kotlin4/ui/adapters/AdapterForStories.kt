package com.geektech.kotlin4.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.geektech.kotlin4.R
import com.geektech.kotlin4.databinding.ItemRecyclerBinding

class AdapterForStories : RecyclerView.Adapter<AdapterForStories.ViewHolder>() {
    val list = ArrayList<Int>()

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(i: Int) {
            binding.textNum.setText(i)
        }

        private val binding = ItemRecyclerBinding.bind(itemView)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_recycler, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
    fun addStory(int: Int){
        list.add(int)
        notifyDataSetChanged()
    }

}