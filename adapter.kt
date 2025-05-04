// recommendation_adapter.kt
package com.example.city

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.city.databinding.ItemBinding

class Adapter(private val items: List<String>) :
    RecyclerView.Adapter<Adapter.ViewHolder>() {

    class ViewHolder(val binding: ItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        Log.d("CityReport", "Binding item at position ddddddddddddddddddddddd")
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemBinding.inflate(layoutInflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.d("CityReport", "Binding item at position ${items[position]}")
        holder.binding.title.text = items[position]
    }

    override fun getItemCount(): Int = items.size
}