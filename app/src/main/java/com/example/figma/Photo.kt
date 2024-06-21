package com.example.figma

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Photo : AppCompatActivity() {

    private lateinit var closeTextView: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.photo)

        closeTextView = findViewById<Button>(R.id.closeTextView)

        closeTextView.setOnClickListener {
            val intent = Intent(this, Profile::class.java)// Указываем путь куда надо перейти
            startActivity(intent)//переход
        }
    }
}