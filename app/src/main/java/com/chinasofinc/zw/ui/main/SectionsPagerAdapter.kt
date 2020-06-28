package com.chinasofinc.zw.ui.main

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.chinasofinc.zw.R

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter(
    private val context: Context,
    private val tabs: Array<Int>,
    fm: FragmentManager
) :
    FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        return PlaceholderFragment.newInstance(
            position + 1,
            context.resources.getString(tabs[position])
        )
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(tabs[position])
    }

    override fun getCount(): Int {
        // Show 2 total pages.
        return tabs.size
    }
}