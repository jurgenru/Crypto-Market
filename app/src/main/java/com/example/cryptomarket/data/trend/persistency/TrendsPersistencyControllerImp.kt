package com.example.cryptomarket.data.trend.persistency

import com.example.cryptomarket.model.Trend

class TrendsPersistencyControllerImp: TrendsPersistencyController {
    private var trendList: List<Trend> = listOf()

    override fun getTrendList(): List<Trend> {
        return trendList
    }

    override fun saveTrend(trends: List<Trend>){
        trendList = trends
    }
}