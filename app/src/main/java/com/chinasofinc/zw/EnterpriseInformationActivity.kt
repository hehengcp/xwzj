package com.chinasofinc.zw

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import com.chinasofinc.zw.ui.EnterpriseInformation.EnterpriseInformationPagerAdapter
import com.chinasofinc.zw.ui.base.AbsTabActivity
import com.chinasofinc.zw.ui.main.SectionsPagerAdapter
import java.util.ArrayList

class EnterpriseInformationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_tab_page)
        val sectionsPagerAdapter = EnterpriseInformationPagerAdapter(this, getTabIds(), supportFragmentManager)
        val viewPager: ViewPager = findViewById(R.id.view_pager)
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = findViewById(R.id.tabs)
        tabs.setupWithViewPager(viewPager)
        findViewById<TextView>(R.id.tv_title).text = "企业信息"
        findViewById<View>(R.id.img_back).setOnClickListener {
            onBackPressed()
        }
    }

    fun getTabIds(): Array<Int> = arrayOf(
        R.string.qyxx_tab_text_1,
        R.string.qyxx_tab_text_2
    )
}