package com.chinasofinc.zw


import com.chinasofinc.zw.ui.base.AbsTabActivity


class AccountSettingsActivity : AbsTabActivity() {
    override fun getTabIds(): Array<Int> = arrayOf(
        R.string.setting_tab_text_1,
        R.string.setting_tab_text_2,
        R.string.setting_tab_text_3,
        R.string.setting_tab_text_4
    )

    override fun getTitleString(): String = "账号设置";

}