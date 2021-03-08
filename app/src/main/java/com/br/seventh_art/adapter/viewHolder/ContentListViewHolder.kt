package com.br.seventh_art.adapter.viewHolder

import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.br.seventh_art.R

class ContentListViewHolder(
    view: View
):  RecyclerView.ViewHolder(view) {

    val contentTitle by lazy { itemView.findViewById<TextView>(R.id.content_title) }
    val cardView by lazy { itemView.findViewById<CardView>(R.id.content_cardview) }
}