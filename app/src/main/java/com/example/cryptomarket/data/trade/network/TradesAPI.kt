package com.example.cryptomarket.data.trade.network

import com.example.cryptomarket.model.Trade
import retrofit2.http.GET

interface TradesAPI {
    @GET("/trades")
    suspend fun getAllTrades(): List<Trade>
}