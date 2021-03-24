package com.br.seventh_art.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.br.seventh_art.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val sigInButton by lazy { findViewById<Button>(R.id.button_signin) }

        sigInButton.setOnClickListener {

            val intent = Intent(it.context, CategoryContentActivity::class.java)
            it.context.startActivity(intent)
        }
    }
}