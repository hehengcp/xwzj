package com.chinasofinc.zw.data


/**
 *
 *
 * @author      gs
 * @date        2020/6/28
 */
data class ResumeItem(val title: String?, val items: List<ResumeItemEntity>)

data class ResumeItemEntity(val key: String?, val value: String)