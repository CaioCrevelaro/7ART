package com.br.seventh_art.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.br.seventh_art.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)//Activity foi trocada para testar funcionalidades
        setContentView(R.layout.activity_content)
    }
}