package com.chinasofinc.zw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Switch
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.chinasofinc.zw.ui.base.SimpleStringAdapter

val PRIVACY_TEXTS = arrayListOf(
    "海尔集团", "海尔数字科技(南京)有限公司"
)

class MyPrivacyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_privacy)
        findViewById<TextView>(R.id.tv_title).text = "我的隐私"
        findViewById<View>(R.id.img_back).setOnClickListener {
            onBackPressed()
        }
        findViewById<Switch>(R.id.sw_privacy_top).setOnCheckedChangeListener { compoundButton, b: Boolean ->
            findViewById<androidx.constraintlayout.widget.Group>(R.id.gp_privacy).visibility =
                if (b) View.VISIBLE else View.GONE
        }

        findViewById<RecyclerView>(R.id.rv_privacy_content).apply {
            layoutManager = LinearLayoutManager(context)
            adapter = SimpleStringAdapter(PRIVACY_TEXTS)
        }
    }
}