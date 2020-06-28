package com.chinasofinc.zw.ui.notifications

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.chinasofinc.zw.AccountSettingsActivity
import com.chinasofinc.zw.MyStudyActivity
import com.chinasofinc.zw.R

class NotificationsFragment : Fragment() {

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

        view.findViewById<View>(R.id.iv_mine_setting).setOnClickListener {
            startActivity(
                Intent(
                    requireContext(),
                    AccountSettingsActivity::class.java
                )
            )
        }
        view.findViewById<View>(R.id.tv_mine_my_study).setOnClickListener {
            startActivity(
                Intent(
                    requireContext(),
                    MyStudyActivity::class.java
                )
            )
        }
    }
}