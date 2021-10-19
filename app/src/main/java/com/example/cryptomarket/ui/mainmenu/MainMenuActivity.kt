package com.example.cryptomarket.ui.mainmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.cryptomarket.R
import com.example.cryptomarket.databinding.ActivityMainMenuBinding

class MainMenuActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainMenuBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val navHost =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment_container) as NavHostFragment
        val navController = navHost.navController

        binding.bottomNavigationView.setupWithNavController(navController)

    }
}