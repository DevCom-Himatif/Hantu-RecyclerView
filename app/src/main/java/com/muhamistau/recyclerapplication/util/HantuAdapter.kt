package com.muhamistau.recyclerapplication.util

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import com.muhamistau.recyclerapplication.R
import com.muhamistau.recyclerapplication.model.Hantu

//class HantuAdapter(
//    private val context: Context,
//    private val list: ArrayList<Hantu>
//) : RecyclerView.Adapter<HantuAdapter.ViewHolder> {
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
//        val currentHantu = list[position]
//        holder.namaTextView.text = currentHantu.nama
//        holder.bind(currentHantu) {
//            Toast.makeText(context, "${currentHantu.nama} clicked", Toast.LENGTH_SHORT).show()
//        }
//    }
//
//    inner class ViewHolder(private val itemView: View) : RecyclerView.ViewHolder(itemView) {
//        val namaTextView: TextView = itemView.namaHantu
//        fun bind(hantu: Hantu, listener: (Hantu) -> Unit) {
//                itemView.setOnClickListener { listener(hantu) }
//        }
//    }
//
//}