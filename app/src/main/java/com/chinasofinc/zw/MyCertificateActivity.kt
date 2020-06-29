package com.chinasofinc.zw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MyCertificateActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_certificate)
        findViewById<TextView>(R.id.tv_title).text = "我的证书"
        findViewById<View>(R.id.img_back).setOnClickListener {
            onBackPressed()
        }
    }
}