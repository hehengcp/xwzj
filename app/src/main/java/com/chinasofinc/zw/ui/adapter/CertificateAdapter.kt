package com.chinasofinc.zw.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.chinasofinc.zw.R

/**
 *
 * @ProjectName:    My Application
 * @Package:        com.chinasofinc.zw.ui.adapter
 * @ClassName:      CertificateAdapter
 * @Description:     java类作用描述
 * @Author:         作者名
 * @CreateDate:     2020/6/28 5:53 PM
 * @UpdateUser:     更新者：
 * @UpdateDate:     2020/6/28 5:53 PM
 * @UpdateRemark:   更新说明：
 * @Version:        1.0
 */
class CertificateAdapter(val items:List<>,): Adapter<CertificateAdapter.CertificateViewHolder>() {

    class CertificateViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun <T : View> findView(viewId: Int): T {
            return itemView.findViewById(viewId)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CertificateViewHolder {
        TODO("Not yet implemented")
        var view = LayoutInflater.from(context).inflate(R.layout.item_certificate, parent, false)
        return CertificateViewHolder(view)
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: CertificateViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

}