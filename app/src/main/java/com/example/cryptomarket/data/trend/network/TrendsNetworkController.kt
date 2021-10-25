package com.example.cryptomarket.data.trend.network

import com.example.cryptomarket.model.Trend

interface TrendsNetworkController {
    suspend fun getAllTrends(): List<Trend>
}