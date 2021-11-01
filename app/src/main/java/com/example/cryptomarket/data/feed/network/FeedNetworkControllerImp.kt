package com.example.cryptomarket.data.feed.network

import com.example.cryptomarket.model.Coin
import com.example.cryptomarket.model.Post
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class FeedNetworkControllerImp: FeedNetworkController {
    val client = Retrofit.Builder().baseUrl("http://10.0.2.2:3000/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(FeedAPI::class.java)

    override suspend fun getAllCoins(): List<Coin> {
        return client.getAllCoins()
    }
}