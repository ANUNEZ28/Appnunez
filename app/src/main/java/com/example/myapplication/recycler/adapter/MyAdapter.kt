package com.example.myapplication.recycler.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.recycler.data.myUserItem
import com.example.myapplication.R
import com.example.myapplication.recycler.data.ItemSelectedValue



class MyAdapter(private val dataList : List<myUserItem>) : RecyclerView.Adapter<AllViewHolder>(){

    /** */
    override fun getItemCount(): Int = dataList.size

    /** */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AllViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recicler,parent,false)
        return AllViewHolder(view)

    }

    /** */
    override fun onBindViewHolder(holder: AllViewHolder, position: Int) {

        val userItem : myUserItem = dataList[position]

        with(userItem){

            val AllOrigen = "${origen.name} #${origen.url}"

            holder.tvName.text = name
            holder.tvType.text= typePerson
           holder.tvOrigin.text= AllOrigen

            val context = holder.itemView.context

            Glide.with(context).load(imageURLValue).into(holder.ivUserImage)


        }



    }

}