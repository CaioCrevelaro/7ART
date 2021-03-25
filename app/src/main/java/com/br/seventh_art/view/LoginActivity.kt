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

        val signInButton by lazy { findViewById<Button>(R.id.button_signin_login) }
        val signUPButton by lazy { findViewById<Button>(R.id.button_signup_login) }

        signInButton.setOnClickListener {
            val intent = Intent(it.context, SignInActivity::class.java)
            it.context.startActivity(intent)
        }

        signUPButton.setOnClickListener {
            val intent = Intent(it.context, SignUpActivity::class.java)
            it.context.startActivity(intent)
        }

    }
}