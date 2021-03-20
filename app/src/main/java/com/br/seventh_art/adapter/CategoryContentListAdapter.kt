package com.br.seventh_art.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.br.seventh_art.R
import com.br.seventh_art.adapter.viewHolder.CategoryContentListViewHolder

import com.br.seventh_art.model.CategoryContent

class CategoryContentListAdapter (
    val categoryList: List<CategoryContent>
    ): RecyclerView.Adapter<CategoryContentListViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryContentListViewHolder {

            val view = LayoutInflater.from(parent.context).inflate(R.layout.category_view_content, parent, false)
            return CategoryContentListViewHolder(view)
        }

        override fun getItemCount() = categoryList.size

        override fun onBindViewHolder(holder: CategoryContentListViewHolder, position: Int) {

            val category = holder.categoryContentTitle
            category.text = categoryList[position].categoryContent

        }
    }
