package com.chinasofinc.zw


import com.chinasofinc.zw.ui.base.AbsTabActivity


class CourseRequirementsActivity : AbsTabActivity() {
    override fun getTabIds(): Array<Int> = arrayOf(
        R.string.kcxq_tab_text_1,
        R.string.kcxq_tab_text_2,
        R.string.kcxq_tab_text_3,
        R.string.kcxq_tab_text_4
    )

    override fun getTitleString(): String = "课程需求商"
}