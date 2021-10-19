package com.example.cryptomarket.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cryptomarket.R
import com.example.cryptomarket.ui.mainmenu.tabs.news.NewsActivity

class MainActivity : AppCompatActivity() {
    val newsActivity = NewsActivity()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}