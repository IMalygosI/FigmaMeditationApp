package com.example.figma

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Login  : AppCompatActivity() {

    private lateinit var RegisterTextView: TextView
    private lateinit var ProfilInButton: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.login)

        RegisterTextView = findViewById<TextView>(R.id.RegisterTextView)
        ProfilInButton = findViewById<Button>(R.id.ProfilInButton)

        ProfilInButton.setOnClickListener {
            val intent = Intent(this, Profile::class.java)// Указываем путь куда надо перейти
            startActivity(intent)//переход
        }
        RegisterTextView.setOnClickListener {
            val intent = Intent(this, Register::class.java)// Указываем путь куда надо перейти
            startActivity(intent)//переход
        }
    }
}