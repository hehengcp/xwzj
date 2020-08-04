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
import com.chinasofinc.zw.ui.bean.Recruitment

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
class RecruitmentAdapter(
    val items:List<Recruitment>,
    val context: FragmentActivity?
): Adapter<RecruitmentAdapter.CertificateViewHolder>() {

    class CertificateViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun <T : View> findView(viewId: Int): T {
            return itemView.findViewById(viewId)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CertificateViewHolder {
        var view = LayoutInflater.from(context).inflate(R.layout.item_recruitment, parent, false)
        return CertificateViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: CertificateViewHolder, position: Int) {
        holder.findView<TextView>(R.id.tv_rs).setText(items[position].peopleNumber+"人");
        holder.findView<TextView>(R.id.tv_gzdd).setText(items[position].worklace);
        holder.findView<TextView>(R.id.tv_gw).setText(items[position].jobs);
        holder.findView<TextView>(R.id.tv_xz).setText(items[position].salary);
        holder.findView<TextView>(R.id.tv_fbsj).setText(items[position].time);
        holder.findView<TextView>(R.id.tv_xl).setText(items[position].educationBackground);
        holder.findView<TextView>(R.id.tv_ly).setText(items[position].status);
    }

}