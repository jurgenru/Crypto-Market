package com.example.cryptomarket.data.feed.network

import com.example.cryptomarket.model.Coin

interface FeedNetworkController {
    suspend fun getAllCoins(): List<Coin>
}