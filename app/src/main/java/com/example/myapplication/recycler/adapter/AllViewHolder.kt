package com.example.myapplication.recycler.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class AllViewHolder(view: View): RecyclerView.ViewHolder (view){

    val tvName: TextView=  view.findViewById(R.id.tv_item_recycler_name)
    val tvType : TextView =view.findViewById(R.id.tv_item_recycler_type)
   val tvOrigin : TextView =view.findViewById(R.id.tv_item_recycler_origen_value)
    val ivUserImage : ImageView = view.findViewById(R.id.iv_item_recycler_image)

}