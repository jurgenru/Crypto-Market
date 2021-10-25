package com.example.cryptomarket.data.trade.network

import com.example.cryptomarket.data.news.network.NewsAPI
import com.example.cryptomarket.model.Trade
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class TradesNetworkControllerImp: TradesNetworkController {
    val client = Retrofit.Builder().baseUrl("http://192.168.0.21:1880")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(TradesAPI::class.java)

    override suspend fun getAllTrades(): List<Trade> {
        return client.getAllTrades()
    }
}