package com.example.test3

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(var mList: List<textData>) :
    RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder>() {

    inner class RecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // val logo : ImageView = itemView.findViewById(R.id.logoIv)
        var titleTv: TextView

        init {
            titleTv = itemView.findViewById(R.id.titleTv)
//            var Intent=Intent(this@RecyclerAdapter,AbnormalUltrasoundWind::class.java)
            val AbnormalUltrasoundWindIntent=Intent(MyApplication.context,AbnormalUltrasoundWind::class.java)
            val TemperatureAnomalyIntent=Intent(MyApplication.context,TemperatureAnomaly::class.java)
            val AbnormalHumidityIntent=Intent(MyApplication.context,AbnormalHumidity::class.java)
            titleTv.setOnClickListener {
                val position: Int = adapterPosition
                when (position) {
                    //MyApplication.context,AbnormalUltrasoundWindIntent
                    0 -> startActivity(MyApplication.context,AbnormalUltrasoundWindIntent,null)
                    1 -> startActivity(MyApplication.context,TemperatureAnomalyIntent,null)
                    2 -> startActivity(MyApplication.context,AbnormalHumidityIntent,null)
                    3 -> Toast.makeText(titleTv.context, "第四个位置", Toast.LENGTH_SHORT).show()
                    4 -> Toast.makeText(titleTv.context, "第五个位置", Toast.LENGTH_SHORT).show()
                }
            }
            //todo 关于Android Activity之间传递数据的6种方式 https://blog.csdn.net/u012602304/article/details/87882749


            //    }

        }


    }

    fun setFilteredList(mList: List<textData>) {
        this.mList = mList
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_recycler, parent, false)
        return RecyclerViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        //  holder.logo.setImageResource(mList[position].logo)
        holder.titleTv.text = mList[position].title
    }

    override fun getItemCount(): Int {
        return mList.size
    }
}