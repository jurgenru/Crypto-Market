package com.example.cryptomarket.ui.activities

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.cryptomarket.R
import com.example.cryptomarket.ui.fragments.NewsFragment

class NewsActivity: AppCompatActivity() {
    val newsFragment = NewsFragment()
    override fun onCreate (savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)
    }
}