package com.example.cryptomarket.data.trend.network

import com.example.cryptomarket.model.Trend
import retrofit2.http.GET

interface TrendsAPI {
    @GET("/trends")
    suspend fun getAllTrends(): List<Trend>
}