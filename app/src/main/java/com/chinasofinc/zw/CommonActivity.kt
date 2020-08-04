package com.chinasofinc.zw

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

const val COMMON_TITLE = "COMMON_TITLE"

class CommonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_common)

        findViewById<TextView>(R.id.tv_title).text = intent.extras?.getCharSequence(COMMON_TITLE)
    }

    companion object {
        fun start(cxt: Context, title: CharSequence) {
            cxt.startActivity(Intent(cxt, CommonActivity::class.java).also {
                it.putExtra(COMMON_TITLE, title)
            })
        }
    }
}