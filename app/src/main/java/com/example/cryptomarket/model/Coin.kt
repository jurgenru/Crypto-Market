package com.example.cryptomarket.model
import java.io.Serializable

data class Coin(val coinName: String,
                val shortDescription: String,
                val imageUrl: String,
                val price: Double): Serializable
