package com.example.ws01actorsfragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class WS01ActorsAdapter : RecyclerView.Adapter<WS01ActorsAdapter.EmptyViewHolder>() {

    class EmptyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmptyViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.item_actors_empty, parent, false)
        return EmptyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 1
    }

    override fun onBindViewHolder(holder: EmptyViewHolder, position: Int) {
        Toast.makeText(holder.itemView.context, "There are no actors right now", Toast.LENGTH_SHORT).show()
    }
}