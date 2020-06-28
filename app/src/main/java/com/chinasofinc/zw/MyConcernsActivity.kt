package com.chinasofinc.zw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SimpleAdapter
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.chinasofinc.zw.ui.base.SimpleStringAdapter
import androidx.recyclerview.widget.DiffUtil.ItemCallback as ItemCallback1

val TEXTS = arrayListOf(
    "海尔集团", "海尔数字科技(南京)有限公司"
)

class MyConcernsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_concerns)
        findViewById<TextView>(R.id.tv_title).text = "我的关注"

        findViewById<RecyclerView>(R.id.rv_concerns_content).apply {
            layoutManager = LinearLayoutManager(context)
            adapter = SimpleStringAdapter(TEXTS)
        }
    }
}