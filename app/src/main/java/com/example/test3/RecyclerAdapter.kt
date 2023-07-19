package com.example.test3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(var mList: List<textData>) :
    RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder>() {

    inner class RecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // val logo : ImageView = itemView.findViewById(R.id.logoIv)
        var titleTv: TextView

        init {
            titleTv = itemView.findViewById(R.id.titleTv)
            titleTv.setOnClickListener {
                val position: Int = adapterPosition
                when (position) {
                    0 -> Toast.makeText(titleTv.context, "第一个位置", Toast.LENGTH_SHORT).show()
                    1 -> Toast.makeText(titleTv.context, "第二个位置", Toast.LENGTH_SHORT).show()
                    2 -> Toast.makeText(titleTv.context, "第三个位置", Toast.LENGTH_SHORT).show()
                    3 -> Toast.makeText(titleTv.context, "第四个位置", Toast.LENGTH_SHORT).show()
                    4 -> Toast.makeText(titleTv.context, "第五个位置", Toast.LENGTH_SHORT).show()
                    5 -> Toast.makeText(titleTv.context, "第六个位置", Toast.LENGTH_SHORT).show()
                    6 -> Toast.makeText(titleTv.context, "第七个位置", Toast.LENGTH_SHORT).show()
                    7 -> Toast.makeText(titleTv.context, "第八个位置", Toast.LENGTH_SHORT).show()
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