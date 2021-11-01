package com.example.cryptomarket.data.feed.network

import com.example.cryptomarket.model.Coin
import retrofit2.http.GET

interface FeedAPI {
    @GET("/feed")
    suspend fun getAllCoins(): List<Coin>
}