package com.chinasofinc.zw.ui.EnterpriseInformation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.chinasofinc.zw.R
import com.chinasofinc.zw.ui.adapter.CertificateAdapter
import com.chinasofinc.zw.ui.bean.Certificate
import com.chinasofinc.zw.ui.main.PageViewModel

/**
 * A placeholder fragment containing a simple view.
 */
class CertificateFragment : Fragment() {

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
        var manager : LinearLayoutManager = LinearLayoutManager(activity)
        recyclerView.layoutManager = manager
        recyclerView.adapter = CertificateAdapter(setData(),activity);
        return root
    }

    fun setData(): MutableList<Certificate> {
        var certificateList: MutableList<Certificate> = ArrayList()
        var cer = Certificate();
        cer.name = "双软认证";
        cer.industry = "软件行业";
        cer.field = "服务类";
        cer.level = "中国软件行业协会壹级";
        cer.describe = "软件产品评估和软件企业评估";
        certificateList.add(cer)
        var cer1 = Certificate();
        cer1.name = "安全生产许可证";
        cer1.industry = "建筑业";
        cer1.field = "服务类";
        cer1.level = "房屋建筑工程施工总承包壹级";
        cer1.describe = "矿山企业、建筑施工企业和危险化学品、烟花爆竹、民用爆炸物品生产企业必备的一个证件";
        certificateList.add(cer1)
        var cer2 = Certificate();
        cer2.name = "军工保密资质";
        cer2.industry = "软件行业";
        cer2.field = "服务类";
        cer2.level = "军工二级保密资质";
        cer2.describe = "企业进入军工产品领域的前提";
        certificateList.add(cer2)
        return certificateList;
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
        fun newInstance(sectionNumber: Int, sectionText: String): CertificateFragment {
            return CertificateFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_SECTION_NUMBER, sectionNumber)
                    putString(ARG_SECTION_TEXT, sectionText)
                }
            }
        }
    }
}