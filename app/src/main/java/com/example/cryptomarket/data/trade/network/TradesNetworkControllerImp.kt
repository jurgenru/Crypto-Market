package com.example.cryptomarket.data.trade.network

import com.example.cryptomarket.data.news.network.NewsAPI
import com.example.cryptomarket.model.Trade
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class TradesNetworkControllerImp: TradesNetworkController {
    val client = Retrofit.Builder().baseUrl("http://10.0.2.2:3000/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(TradesAPI::class.java)

    override suspend fun getAllTrades(): List<Trade> {
        return client.getAllTrades()
    }
}