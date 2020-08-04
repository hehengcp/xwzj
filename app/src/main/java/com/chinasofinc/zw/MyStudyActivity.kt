package com.chinasofinc.zw

import com.chinasofinc.zw.ui.base.AbsTabActivity

class MyStudyActivity : AbsTabActivity() {
    override fun getTabIds(): Array<Int> = arrayOf(
        R.string.my_study_tab_text_1,
        R.string.my_study_tab_text_2,
        R.string.my_study_tab_text_3,
        R.string.my_study_tab_text_4
    )

    override fun getTitleString(): String = "我的学习"
}