package com.example.cryptomarket.data.trend

import android.content.Context
import com.example.cryptomarket.data.trend.network.TrendsNetworkController
import com.example.cryptomarket.data.trend.persistency.TrendsPersistencyController
import com.example.cryptomarket.model.Trend
import com.example.cryptomarket.ui.isNetworkConnected
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class TrendsRepository(val network: TrendsNetworkController, val persistency: TrendsPersistencyController) {
    fun getAllTrendList(context: Context): Flow<List<Trend>> {
        return flow {
            emit(persistency.getTrendList())
            try {
                if(isNetworkConnected(context)){
                    val trends = network.getAllTrends()
                    persistency.saveTrend(trends)
                    emit(trends)
                }
            } catch (e: Exception){}
        }
    }
}