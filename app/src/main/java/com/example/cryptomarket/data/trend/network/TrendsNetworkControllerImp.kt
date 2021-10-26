package com.example.cryptomarket.data.trend.network

import com.example.cryptomarket.model.Trend
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class TrendsNetworkControllerImp: TrendsNetworkController {
    val client = Retrofit.Builder().baseUrl("http://192.168.0.21:3000")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(TrendsAPI::class.java)

    override suspend fun getAllTrends(): List<Trend> {
        return client.getAllTrends()
    }
}