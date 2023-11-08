package com.example.chplay

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class StoreAdapter (private val list: ArrayList<store>, private val context: Context) : RecyclerView.Adapter<StoreAdapter.ViewHolder>(){

    inner class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val nameGroupApp: TextView = view.findViewById(R.id.textView3)
        val listApp: RecyclerView = view.findViewById(R.id.viewstore)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoreAdapter.ViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.itemstore, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: StoreAdapter.ViewHolder, position: Int) {
        holder.nameGroupApp.text = list[position].nameStore
        val groupCustom: AppAdapter = AppAdapter(list[position].listApp)
        holder.listApp.adapter = groupCustom
        holder.listApp.layoutManager = LinearLayoutManager(
            this.context,
            LinearLayoutManager.HORIZONTAL,
            false
        )
    }

    override fun getItemCount(): Int {
        return list.size
    }
}