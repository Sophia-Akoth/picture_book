package com.example.picturebook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Image5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image5)
        btn5.setOnClickListener
        val intent = intent(baseContext,Image4::class.java)
        startActivity(intent)
    }
}