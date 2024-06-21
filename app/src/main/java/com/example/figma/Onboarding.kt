package com.example.figma

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Onboarding  : AppCompatActivity() {

    private lateinit var LogInButton: Button
    private lateinit var RegisterTextView: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.onboarding)

        LogInButton = findViewById<Button>(R.id.LogInButton)// Обработчик кнопки для перехода
        RegisterTextView = findViewById<Button>(R.id.RegisterTextView)// Обработчик кнопки для перехода

        LogInButton.setOnClickListener {
            val intent = Intent(this, Login::class.java)// Указываем путь куда надо перейти
            startActivity(intent)//переход
        }

        RegisterTextView.setOnClickListener {
            val intent = Intent(this, Register::class.java)// Указываем путь куда надо перейти
            startActivity(intent)//переход
        }
    }
}