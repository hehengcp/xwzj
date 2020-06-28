package com.chinasofinc.zw

import android.os.Bundle
import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.TextView
import com.chinasofinc.zw.ui.product.ProductPagerAdapter
import com.chinasofinc.zw.ui.product.RecruitmentPagerAdapter

class ProductActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_tab_page)
        val sectionsPagerAdapter = ProductPagerAdapter(this, getTabIds(), supportFragmentManager)
        val viewPager: ViewPager = findViewById(R.id.view_pager)
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = findViewById(R.id.tabs)
        tabs.setupWithViewPager(viewPager)
        findViewById<TextView>(R.id.tv_title).text = "产品中心"
        findViewById<View>(R.id.img_back).setOnClickListener {
            onBackPressed()
        }
    }

    fun getTabIds(): Array<Int> = arrayOf(
        R.string.cpzx_tab_text_1,
        R.string.cpzx_tab_text_2
    )
}