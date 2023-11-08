package com.example.chplay

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class AppAdapter(private val list: ArrayList<App>): RecyclerView.Adapter<AppAdapter.ViewHolder>() {
    inner class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val imageApp: ShapeableImageView = view.findViewById(R.id.anhapp)
        val startApp: TextView = view.findViewById(R.id.sao)
        val nameApp: TextView = view.findViewById(R.id.ten)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AppAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.itemapp, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: AppAdapter.ViewHolder, position: Int) {
        holder.nameApp.text = list[position].nameApp
        holder.imageApp.setImageResource(list[position].image)
        holder.startApp.text = list[position].star.toString()
    }

    override fun getItemCount(): Int {
        return list.size
    }
}