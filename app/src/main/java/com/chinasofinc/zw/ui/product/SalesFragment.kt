package com.chinasofinc.zw.ui.product

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.chinasofinc.zw.R
import com.chinasofinc.zw.ui.adapter.ProductAdapter
import com.chinasofinc.zw.ui.main.PageViewModel

/**
 * A placeholder fragment containing a simple view.
 */
class SalesFragment : Fragment() {

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
        recyclerView.layoutManager = GridLayoutManager(activity,2)
        recyclerView.adapter = ProductAdapter(setData(),activity);
        return root
    }

    fun setData(): MutableList<String> {
        var productList: MutableList<String> = ArrayList()
        productList.add("")
        productList.add("")
        productList.add("")
        productList.add("")
        return productList;
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
        fun newInstance(sectionNumber: Int, sectionText: String): SalesFragment {
            return SalesFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_SECTION_NUMBER, sectionNumber)
                    putString(ARG_SECTION_TEXT, sectionText)
                }
            }
        }
    }
}