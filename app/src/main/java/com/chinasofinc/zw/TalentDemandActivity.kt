package com.chinasofinc.zw

import com.chinasofinc.zw.ui.base.AbsTabActivity

class TalentDemandActivity : AbsTabActivity() {
    override fun getTabIds(): Array<Int> = arrayOf(
        R.string.kcgy_tab_text_1,
        R.string.kcgy_tab_text_2,
        R.string.kcgy_tab_text_3,
        R.string.kcgy_tab_text_4
    )

    override fun getTitleString(): String = "人才需求商"
}