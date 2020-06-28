package com.chinasofinc.zw.ui.base

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.chinasofinc.zw.R


/**
 *
 *
 * @author      gs
 * @date        2020/6/28
 */
class SimpleStringAdapter(private val data: List<String>) :
    RecyclerView.Adapter<SimpleStringAdapter.SimpleViewHolder>() {


    override fun getItemCount(): Int = data.size


    override fun onBindViewHolder(holder: SimpleViewHolder, position: Int) {
        holder.textView.text = data[position]
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SimpleViewHolder =
        SimpleViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_simple_string, parent, false)
        )

    inner class SimpleViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var textView: TextView = view as TextView
    }

}