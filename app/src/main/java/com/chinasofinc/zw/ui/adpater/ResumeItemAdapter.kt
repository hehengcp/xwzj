package com.chinasofinc.zw.ui.adpater

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.chinasofinc.zw.R
import com.chinasofinc.zw.data.ResumeItem
import com.chinasofinc.zw.data.ResumeItemEntity


/**
 *
 *
 * @author      gs
 * @date        2020/6/28
 */
class ResumeItemAdapter(private val data: List<ResumeItemEntity>) :
    RecyclerView.Adapter<ResumeItemAdapter.SimpleViewHolder>() {


    override fun getItemCount(): Int = data.size


    override fun onBindViewHolder(holder: SimpleViewHolder, position: Int) {
        data[position].apply {
            holder.key.visibility = if (key.isNullOrBlank()) View.GONE else View.VISIBLE
            holder.key.text = key ?: ""
            holder.values.text = value
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SimpleViewHolder =
        SimpleViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_resume_layout, parent, false)
        )

    inner class SimpleViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var key: TextView = view.findViewById(R.id.tv_resume_key)
        var values: TextView = view.findViewById(R.id.tv_resume_val)
    }

}