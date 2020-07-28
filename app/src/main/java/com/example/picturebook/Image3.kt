package com.example.picturebook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Image3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image3)
        etNext3.setOnClickListener
        val intention = intentt(baseContext, Image4::class.java)
        startActivity(intention)
        etPrevious2.setOnClickListener
        val intent = intent(baseContext, Image2::class.java)
        startActivity(intent)
    }
}