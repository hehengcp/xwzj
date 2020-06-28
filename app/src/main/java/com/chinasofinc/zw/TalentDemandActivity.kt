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
import com.chinasofinc.zw.ui.base.AbsTabActivity
import com.chinasofinc.zw.ui.main.SectionsPagerAdapter
import java.util.ArrayList

class TalentDemandActivity : AbsTabActivity() {
    override fun getTabIds(): Array<Int> = arrayOf(
        R.string.kcgy_tab_text_1,
        R.string.kcgy_tab_text_2,
        R.string.kcgy_tab_text_3,
        R.string.kcgy_tab_text_4
    )

    override fun getTitleString(): String = "人才需求商"
}