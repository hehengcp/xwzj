package com.chinasofinc.zw.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Switch
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.viewpager.widget.ViewPager
import com.chinasofinc.zw.R
import com.chinasofinc.zw.data.CommonState
import com.chinasofinc.zw.ui.main.SectionsPagerAdapter
import com.google.android.material.tabs.TabLayout

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProviders.of(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)

        root.findViewById<Switch>(R.id.sw_home_change)
            .apply {
                setOnCheckedChangeListener { compoundButton, b ->
                    CommonState.enterprise = b;
                }
                isChecked = CommonState.enterprise
            }

        val sectionsPagerAdapter =
            SectionsPagerAdapter(requireContext(), getTabIds(), childFragmentManager)
        val viewPager: ViewPager = root.findViewById(R.id.view_pager)
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = root.findViewById(R.id.tabs)
        tabs.setupWithViewPager(viewPager)
        return root
    }

    fun getTabIds(): Array<Int> = arrayOf(
        R.string.home_tab_text_1,
        R.string.home_tab_text_2,
        R.string.home_tab_text_3,
        R.string.home_tab_text_4
    )
}