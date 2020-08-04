package com.chinasofinc.zw

import com.chinasofinc.zw.ui.base.AbsTabActivity

class MyExamActivity : AbsTabActivity() {
    override fun getTabIds(): Array<Int> = arrayOf(
        R.string.my_exam_tab_text_1,
        R.string.my_exam_tab_text_2,
        R.string.my_exam_tab_text_3
    )

    override fun getTitleString(): String = "我的考试"
}