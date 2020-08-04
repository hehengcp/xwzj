package com.chinasofinc.zw


import com.chinasofinc.zw.ui.base.AbsTabActivity


class CourseSupplyActivity : AbsTabActivity() {
    override fun getTabIds(): Array<Int> = arrayOf(
        R.string.rcxq_tab_text_1,
        R.string.rcxq_tab_text_2,
        R.string.rcxq_tab_text_3,
        R.string.rcxq_tab_text_4
    )

    override fun getTitleString(): String = "课程供应商"
}