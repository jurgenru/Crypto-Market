package com.example.cryptomarket.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cryptomarket.R
import com.example.cryptomarket.replaceFragment
import com.example.cryptomarket.ui.fragments.FeedFragment
import com.example.cryptomarket.ui.fragments.NewsFragment
import com.example.cryptomarket.ui.fragments.WalletFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainMenuActivity : AppCompatActivity() {

    private lateinit var bottomNavigationView: BottomNavigationView

    private val walletFragment = WalletFragment()
    private val feedFragment = FeedFragment()
    private val newsFragment = NewsFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        bottomNavigationView = findViewById(R.id.bottomNavigationView)
        bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.menuItemProfile -> {
                    replaceFragment(R.id.container, walletFragment)
                }
                R.id.menuItemFeed -> {
                    replaceFragment(R.id.container, feedFragment)
                }
                R.id.menuItemNews -> {
                    replaceFragment(R.id.container, newsFragment)
                }
            }
            true
        }

        bottomNavigationView.selectedItemId = R.id.menuItemFeed
    }
}