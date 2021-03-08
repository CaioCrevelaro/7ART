package com.br.seventh_art.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.br.seventh_art.R
import com.br.seventh_art.adapter.ContentListAdapter
import com.br.seventh_art.model.Content

class ContentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_content)

        initViews()
    }

    private fun initViews() {
        setContentView(R.layout.activity_content)

        val recyclerView by lazy { findViewById<RecyclerView>(R.id.content_activity_recycler_view) }
        val toolbar by lazy { findViewById<Toolbar>(R.id.content_activity_toolbar) }
        val contentTitle by lazy { findViewById<TextView>(R.id.content_title) }

        val list = contentList().toList()

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        recyclerView.adapter = ContentListAdapter(list)

    }

    private fun contentList(): MutableList<Content> {

        val list = mutableListOf<Content>()

        list.add(Content("Soul", "Comédia"))
        list.add(Content("Minha Mãe É Uma Peça", "Comédia"))
        list.add(Content("We're The Millers", "Comédia"))
        list.add(Content("Soul", "Comédia"))
        list.add(Content("Minha Mãe É Uma Peça", "Comédia"))
        list.add(Content("We're The Millers", "Comédia"))
        list.add(Content("Soul", "Comédia"))
        list.add(Content("Minha Mãe É Uma Peça", "Comédia"))
        list.add(Content("We're The Millers", "Comédia"))

        return list
    }
}