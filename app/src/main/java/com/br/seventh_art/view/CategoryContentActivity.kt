package com.br.seventh_art.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toolbar
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.br.seventh_art.R
import com.br.seventh_art.adapter.CategoryContentListAdapter
import com.br.seventh_art.adapter.ContentListAdapter
import com.br.seventh_art.model.CategoryContent
import com.br.seventh_art.model.Content

class CategoryContentActivity : AppCompatActivity() {
    var gridLayoutManager:GridLayoutManager? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //   setContentView(R.layout.category_activity_content)
        initViews()

    }

    private fun initViews() {
        val recyclerView by lazy { findViewById<RecyclerView>(R.id.category_content_activity_recycler_view) }
        val toolbar by lazy { findViewById<Toolbar>(R.id.category_content_activity_toolbar) }
        val tvFilmes by lazy { findViewById<TextView>(R.id.category_content_activity_toolbar_filmes) }
        val tvSeries by lazy { findViewById<TextView>(R.id.category_content_activity_toolbar_Series) }
        val divider by lazy { findViewById<View>(R.id.divider) }

        val list = categoryList().toList()

        gridLayoutManager = GridLayoutManager(applicationContext, 2,LinearLayoutManager.VERTICAL, false)

        recyclerView.layoutManager = gridLayoutManager
        recyclerView.adapter = CategoryContentListAdapter(list)
    }

    private fun categoryList(): MutableList<CategoryContent> {
        val list = mutableListOf<CategoryContent>()

        list.add(CategoryContent("Comédia"))
        list.add(CategoryContent("Terror"))
        list.add(CategoryContent("Ação"))
        list.add(CategoryContent("Romance"))
        list.add(CategoryContent("Drama"))
        list.add(CategoryContent("Documentários"))
        list.add(CategoryContent("Suspense"))
        list.add(CategoryContent("Animações"))
        list.add(CategoryContent("Ficção científica"))

        return list
    }



}