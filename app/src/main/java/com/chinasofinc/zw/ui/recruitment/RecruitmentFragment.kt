package com.chinasofinc.zw.ui.product

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.chinasofinc.zw.R
import com.chinasofinc.zw.ui.adapter.ProductAdapter
import com.chinasofinc.zw.ui.adapter.RecruitmentAdapter
import com.chinasofinc.zw.ui.bean.Recruitment
import com.chinasofinc.zw.ui.main.PageViewModel

/**
 * A placeholder fragment containing a simple view.
 */
class RecruitmentFragment : Fragment() {

    private lateinit var pageViewModel: PageViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        pageViewModel = ViewModelProviders.of(this).get(PageViewModel::class.java).apply {
            setIndex(arguments?.getInt(ARG_SECTION_NUMBER) ?: 1)
            setText(arguments?.getString(ARG_SECTION_TEXT) ?: "")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_certificate, container, false)
        var recyclerView = root.findViewById<RecyclerView>(R.id.recycleview)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        recyclerView.adapter = RecruitmentAdapter(setData(),activity);
        return root
    }

    fun setData(): MutableList<Recruitment> {
        var recruitmentList: MutableList<Recruitment> = ArrayList()
        var rec1 = Recruitment()
        rec1.jobs = "销售主管"
        rec1.peopleNumber = "3"
        rec1.salary = "1-2万/月"
        rec1.worklace = "南京"
        rec1.time = "2020/4/15"
        rec1.status = "招聘中"
        rec1.educationBackground = "大专以上"

        recruitmentList.add(rec1)
        var rec2 = Recruitment()
        rec2.jobs = "前台接待"
        rec2.peopleNumber = "2"
        rec2.salary = "5-6千/月"
        rec2.worklace = "南京"
        rec2.time = "2020/5/3"
        rec2.status = "招聘中"
        rec2.educationBackground = "高中以上"
        recruitmentList.add(rec2)

        var rec3 = Recruitment();
        rec3.jobs = "维修工程师"
        rec3.peopleNumber = "若干"
        rec3.salary = "面议"
        rec3.worklace = "南京"
        rec3.time = "2020/5/3"
        rec3.status = "关闭"
        rec3.educationBackground = "大专以上"
        recruitmentList.add(rec3)

        var rec4 = Recruitment();
        rec4.jobs = "技术主管"
        rec4.peopleNumber = "1"
        rec4.salary = "3-4万/月"
        rec4.worklace = "青岛"
        rec4.time = "2020/6/14"
        rec4.status = "招聘中"
        rec4.educationBackground = "本科以上"
        recruitmentList.add(rec4)
        return recruitmentList;
    }

    companion object {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private const val ARG_SECTION_NUMBER = "section_number"
        private const val ARG_SECTION_TEXT = "section_text"

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        @JvmStatic
        fun newInstance(sectionNumber: Int, sectionText: String): RecruitmentFragment {
            return RecruitmentFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_SECTION_NUMBER, sectionNumber)
                    putString(ARG_SECTION_TEXT, sectionText)
                }
            }
        }
    }
}