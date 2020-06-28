package com.chinasofinc.zw.ui.notifications

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.chinasofinc.zw.*
import com.chinasofinc.zw.data.CommonState


class NotificationsFragment : Fragment(), View.OnClickListener {

    private lateinit var notificationsViewModel: NotificationsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        notificationsViewModel =
            ViewModelProviders.of(this).get(NotificationsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_notifications, container, false)
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val llContent = view.findViewById<LinearLayout>(R.id.ll_mine_content)
        if (CommonState.enterprise) {
            llContent.removeAllViews()
            View.inflate(requireContext(), R.layout.layout_enterprise, llContent)
            setQyListener(view);
        } else {
            view.findViewById<View>(R.id.iv_mine_setting)?.setOnClickListener(this)
            view.findViewById<View>(R.id.tv_mine_my_study)?.setOnClickListener(this)
            view.findViewById<View>(R.id.tv_mine_my_exam)?.setOnClickListener(this)
            view.findViewById<View>(R.id.tv_mine_my_certificate)?.setOnClickListener(this)
            view.findViewById<View>(R.id.tv_mine_my_resume)?.setOnClickListener(this)
            view.findViewById<View>(R.id.tv_mine_my_concerns)?.setOnClickListener(this)
            view.findViewById<View>(R.id.tv_mine_my_privacy)?.setOnClickListener(this)
        }
    }

    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.iv_mine_setting -> AccountSettingsActivity::class.java
            R.id.tv_mine_my_study -> MyStudyActivity::class.java
            R.id.tv_mine_my_exam -> MyExamActivity::class.java
            R.id.tv_mine_my_certificate -> MyCertificateActivity::class.java
            R.id.tv_mine_my_resume -> MyResumeActivity::class.java
            R.id.tv_mine_my_concerns -> MyConcernsActivity::class.java
            R.id.tv_mine_my_privacy -> MyPrivacyActivity::class.java
            else -> null
        }?.run {
            startActivity(
                Intent(
                    requireContext(), this
                )
            )
        }
    }

    fun setQyListener(view: View) {
        view.findViewById<View>(R.id.tv_mine_qyxx).setOnClickListener {
            startActivity(
                Intent(
                    requireContext(),
                    EnterpriseInformationActivity::class.java
                )
            )
        }
        view.findViewById<View>(R.id.tv_mine_cpzx).setOnClickListener {
            startActivity(
                Intent(
                    requireContext(),
                    ProductActivity::class.java
                )
            )
        }
        view.findViewById<View>(R.id.tv_mine_zpxx).setOnClickListener {
            startActivity(
                Intent(
                    requireContext(),
                    RecruitmentActivity::class.java
                )
            )
        }
        view.findViewById<View>(R.id.tv_mine_kcgys).setOnClickListener {
            startActivity(
                Intent(
                    requireContext(),
                    CourseSupplyActivity::class.java
                )
            )
        }
        view.findViewById<View>(R.id.tv_mine_kcxqs).setOnClickListener {
            startActivity(
                Intent(
                    requireContext(),
                    CourseRequirementsActivity::class.java
                )
            )
        }
        view.findViewById<View>(R.id.tv_mine_rcxqs).setOnClickListener {
            startActivity(
                Intent(
                    requireContext(),
                    TalentDemandActivity::class.java
                )
            )
        }
    }
}