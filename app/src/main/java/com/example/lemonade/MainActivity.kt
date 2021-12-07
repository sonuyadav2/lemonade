package com.example.lemonade

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var text:TextView
    lateinit var image:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text=findViewById(R.id.text)
        image=findViewById(R.id.image)
        var click =0
        image.setOnClickListener {
            when (click) {
                0 -> {
                    image.setImageResource(R.drawable.screen1)
                    text.text = "click to select a lemon "
                    click++

                }
                1 -> {
                    image.setImageResource(R.drawable.screen2)
                    text.text = "Click to juice the lemon"
                    click++

                }
                2 -> {
                    image.setImageResource(R.drawable.screen3)
                    text.text = "Click to Drink the Lemonoide"
                    click++

                }
                3 -> {
                    image.setImageResource(R.drawable.screen4)
                    text.text = "Click to start again"
                    click = 0
                }

            }
        }
    }
}