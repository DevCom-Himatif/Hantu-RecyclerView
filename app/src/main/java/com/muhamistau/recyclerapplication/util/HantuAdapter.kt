package com.muhamistau.recyclerapplication.util

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.muhamistau.recyclerapplication.R
import com.muhamistau.recyclerapplication.model.Hantu

//class HantuAdapter(private val list: ArrayList<Hantu>) : RecyclerView.Adapter<HantuAdapter.ViewHolder> {
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//        val view = LayoutInflater.from(parent.context)
//            .inflate(R.layout.item_hantu, parent, false)
//        return ViewHolder(view)
//    }
//
//    override fun getItemCount(): Int = list.size
//
//    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        holder.bind(list[position])
//    }
//
//    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        val textView = itemView.findViewById<TextView>(R.id.namaHantu)
//        fun bind(hantu: Hantu){
//            textView.text = hantu.nama
//        }
//    }
//
//}