package com.example.picturebook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etNext.setOnClickListener
        val intent = intent(baseContext,Image2::class.java)
        startActivity(intent)
    }
}