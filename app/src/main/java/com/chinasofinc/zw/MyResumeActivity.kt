package com.chinasofinc.zw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.chinasofinc.zw.data.ResumeItem
import com.chinasofinc.zw.data.ResumeItemEntity
import com.chinasofinc.zw.ui.adpater.ResumeListAdapter
import com.chinasofinc.zw.ui.base.SimpleStringAdapter

val RESUME_ITEM = arrayListOf(
    ResumeItem(
        "基本信息", arrayListOf(
            ResumeItemEntity("姓名", "刘德华"),
            ResumeItemEntity("性别", "男"),
            ResumeItemEntity("学历", "硕士"),
            ResumeItemEntity("手机号", "18913944556"),
            ResumeItemEntity("民族", "维吾尔"),
            ResumeItemEntity("年龄", "24"),
            ResumeItemEntity("籍贯", "南京"),
            ResumeItemEntity("邮箱", "1820952501@qq.com")
        )
    ),
    ResumeItem(
        "教育经历", arrayListOf(
            ResumeItemEntity("学校", "南京大学"),
            ResumeItemEntity("专业", "计算机与人工智能"),
            ResumeItemEntity("学历", "本科")
        )
    )
    ,
    ResumeItem(
        "工作经验", arrayListOf(
            ResumeItemEntity("就职时间", "2010/9-2013/6"),
            ResumeItemEntity("公司", "华为"),
            ResumeItemEntity("职位", "算法工程师"),
            ResumeItemEntity("工作内容", "负责编写开发华为Mate系列手机的内核算法，优化性能、安全加密等")
        )
    )
    ,
    ResumeItem(
        null, arrayListOf(
            ResumeItemEntity("就职时间", "2013/7至今"),
            ResumeItemEntity("公司", "中软国际"),
            ResumeItemEntity("职位", "技术架构师"),
            ResumeItemEntity("工作内容", "负责项目的整体架构，设计，运维等方案的规划")
        )
    ),
    ResumeItem(
        "自我评价", arrayListOf(
            ResumeItemEntity(null, "为人乐观大方，积极主动，善于解决问题，兴趣爱好广泛")
        )
    )

)

class MyResumeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_resume)
        findViewById<TextView>(R.id.tv_title).text = "我的简历"

        findViewById<RecyclerView>(R.id.rv_resume_content).apply {
            layoutManager = LinearLayoutManager(context)
            adapter = ResumeListAdapter(RESUME_ITEM)
        }
    }
}