package com.example.figma

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Profile : AppCompatActivity() {

    private lateinit var imageView2: ImageView
    private lateinit var exitbutton: Button
    private lateinit var Dobavit: ImageView
    private lateinit var music: ImageView
    private lateinit var menu: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.profile)

        menu = findViewById<ImageView>(R.id.menu)
        exitbutton = findViewById<Button>(R.id.exitbutton)
        imageView2 = findViewById<ImageView>(R.id.imageView2)
        Dobavit = findViewById<ImageView>(R.id.Dobavit)
        music = findViewById<ImageView>(R.id.music)

        exitbutton.setOnClickListener {
            val intent = Intent(this, Onboarding::class.java)// Указываем путь куда надо перейти
            startActivity(intent)//переход
        }
        imageView2.setOnClickListener {
            val intent = Intent(this, Main::class.java)// Указываем путь куда надо перейти
            startActivity(intent)//переход
        }
        Dobavit.setOnClickListener {
            val intent = Intent(this, Photo::class.java)// Указываем путь куда надо перейти
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