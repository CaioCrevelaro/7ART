package com.br.seventh_art.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.br.seventh_art.R
import com.br.seventh_art.adapter.viewHolder.ContentListViewHolder
import com.br.seventh_art.model.Content

class ContentListAdapter(
   val contentList: List<Content>
): RecyclerView.Adapter<ContentListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContentListViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_content, parent, false)
        return ContentListViewHolder(view)
    }

    override fun getItemCount() = contentList.size

    override fun onBindViewHolder(holder: ContentListViewHolder, position: Int) {

        val title = holder.contentTitle
        title.text = contentList[position].contentTitle

    }
}