package com.br.seventh_art.adapter.viewHolder

import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.br.seventh_art.R

class CategoryContentListViewHolder (
    view : View
):  RecyclerView.ViewHolder(view){

    val categoryContentTitle by lazy {itemView.findViewById<TextView>(R.id.category_content_title)}
    val categoryCardView by lazy {itemView.findViewById<CardView>(R.id.category_content_cardview)}
}