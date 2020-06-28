package com.chinasofinc.zw.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.chinasofinc.zw.R
import com.chinasofinc.zw.ui.bean.Certificate

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
class CertificateAdapter(
    val items:List<Certificate>,
    val context: FragmentActivity?
): Adapter<CertificateAdapter.CertificateViewHolder>() {

    class CertificateViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun <T : View> findView(viewId: Int): T {
            return itemView.findViewById(viewId)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CertificateViewHolder {
        var view = LayoutInflater.from(context).inflate(R.layout.item_certificate, parent, false)
        return CertificateViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: CertificateViewHolder, position: Int) {
        holder.findView<TextView>(R.id.tv_zsmc).setText("证书名称："+items[position].name);
        holder.findView<TextView>(R.id.tv_zzdj).setText("资质等级："+items[position].level);
        holder.findView<TextView>(R.id.tv_ms).setText("描述："+items[position].describe);
        holder.findView<TextView>(R.id.tv_hy).setText("行业："+items[position].industry);
        holder.findView<TextView>(R.id.tv_ly).setText("领域："+items[position].field);
    }

}