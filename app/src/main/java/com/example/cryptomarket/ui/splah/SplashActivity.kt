package com.example.cryptomarket.ui.splah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.content.Intent
import com.example.cryptomarket.R
import com.example.cryptomarket.ui.mainmenu.MainMenuActivity


class SplashActivity : AppCompatActivity() {
    private var showMessage = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        supportActionBar?.hide()

        Handler().postDelayed({
            val intent = Intent(this, MainMenuActivity::class.java)
            startActivity(intent)
            finish()
        }, 2000)
    }
}