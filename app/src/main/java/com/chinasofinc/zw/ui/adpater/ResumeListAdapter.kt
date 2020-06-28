package com.chinasofinc.zw.ui.adpater

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.chinasofinc.zw.R
import com.chinasofinc.zw.data.ResumeItem


/**
 *
 *
 * @author      gs
 * @date        2020/6/28
 */
class ResumeListAdapter(private val data: List<ResumeItem>) :
    RecyclerView.Adapter<ResumeListAdapter.SimpleViewHolder>() {


    override fun getItemCount(): Int = data.size


    override fun onBindViewHolder(holder: SimpleViewHolder, position: Int) {
        data[position].apply {
            holder.title.visibility = if (title.isNullOrBlank()) View.GONE else View.VISIBLE
            holder.title.text = title ?: ""
            holder.content.run {
                layoutManager = LinearLayoutManager(context)
                adapter = ResumeItemAdapter(items)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SimpleViewHolder =
        SimpleViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_resume_list, parent, false)
        )

    inner class SimpleViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var title: TextView = view.findViewById(R.id.tv_resume_list_title)
        var content: RecyclerView = view.findViewById(R.id.rv_resume_list_content)
    }

}