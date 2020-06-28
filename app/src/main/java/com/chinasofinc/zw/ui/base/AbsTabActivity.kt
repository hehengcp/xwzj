package com.chinasofinc.zw.ui.base

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.chinasofinc.zw.R
import com.chinasofinc.zw.ui.main.SectionsPagerAdapter
import com.google.android.material.tabs.TabLayout
import java.util.ArrayList


/**
 *
 *
 * @author      gs
 * @date        2020/6/28
 */
abstract class AbsTabActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_tab_page)
        val sectionsPagerAdapter = SectionsPagerAdapter(this, getTabIds(), supportFragmentManager)
        val viewPager: ViewPager = findViewById(R.id.view_pager)
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = findViewById(R.id.tabs)
        tabs.setupWithViewPager(viewPager)
        findViewById<TextView>(R.id.tv_title).text = getTitleString()
        findViewById<View>(R.id.img_back).setOnClickListener {
            onBackPressed()
        }
    }

    protected abstract fun getTabIds(): Array<Int>
    protected abstract fun getTitleString(): String

}