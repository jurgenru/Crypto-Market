package com.example.cryptomarket.ui.mainmenu.tabs.wallet

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.cryptomarket.R
import com.google.firebase.auth.FirebaseAuth

class WalletActivity: AppCompatActivity() {
    lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wallet)
        firebaseAuth = FirebaseAuth.getInstance()

        findViewById<TextView>(R.id.userIdtextView).text = firebaseAuth.currentUser?.uid
        findViewById<Button>(R.id.signOutButton).setOnClickListener {
            signOut()
        }
    }

    private fun signOut() {
        firebaseAuth.signOut()
        finish()
    }
}