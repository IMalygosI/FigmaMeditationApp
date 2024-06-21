package com.example.figma

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Main  : AppCompatActivity() {

    private lateinit var coala: ImageView
    private lateinit var user: ImageView
    private lateinit var music: ImageView
    private lateinit var menu: ImageView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.main)

        menu = findViewById<ImageView>(R.id.menu)
        coala = findViewById<ImageView>(R.id.coala)
        user = findViewById<ImageView>(R.id.user)
        music = findViewById<ImageView>(R.id.music)

        coala.setOnClickListener {
            val intent = Intent(this, Profile::class.java)// Указываем путь куда надо перейти
            startActivity(intent)//переход
        }
        user.setOnClickListener {
            val intent = Intent(this, Profile::class.java)// Указываем путь куда надо перейти
            startActivity(intent)//переход
        }
        music.setOnClickListener {
            val intent = Intent(this, Listen::class.java)// Указываем путь куда надо перейти
            startActivity(intent)//переход
        }
        menu.setOnClickListener {
            val intent = Intent(this, Menu::class.java)// Указываем путь куда надо перейти
            startActivity(intent)//переход
        }
    }
}