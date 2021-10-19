package com.example.cryptomarket.ui.mainmenu.tabs.news

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.cryptomarket.R
import com.example.cryptomarket.ui.mainmenu.tabs.news.fragments.NewsFragment

class NewsActivity: AppCompatActivity() {
    val newsFragment = NewsFragment()
    override fun onCreate (savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)
    }
}