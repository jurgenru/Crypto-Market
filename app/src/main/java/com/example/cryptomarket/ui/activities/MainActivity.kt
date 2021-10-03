package com.example.cryptomarket.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cryptomarket.R

class MainActivity : AppCompatActivity() {
    val newsActivity = NewsActivity()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}