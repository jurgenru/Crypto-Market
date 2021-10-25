package com.example.cryptomarket.data.trend.persistency

import com.example.cryptomarket.model.Trend

interface TrendsPersistencyController {
    fun getTrendList(): List<Trend>
    fun saveTrend(trends: List<Trend>)
}