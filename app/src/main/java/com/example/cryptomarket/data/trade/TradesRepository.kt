package com.example.cryptomarket.data.trade

import android.content.Context
import com.example.cryptomarket.data.trade.network.TradesNetworkController
import com.example.cryptomarket.data.trade.persistency.TradesPersistencyController
import com.example.cryptomarket.model.Trade
import com.example.cryptomarket.ui.isNetworkConnected
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class TradesRepository(val network: TradesNetworkController, val persistency: TradesPersistencyController) {
    fun getAllTradeList(context: Context): Flow<List<Trade>> {
        return flow {
            emit(persistency.getTradeList())
            try {
                if(isNetworkConnected(context)){
                    val trades = network.getAllTrades()
                    persistency.saveTrade(trades)
                    emit(trades)
                }
            } catch (e: Exception){}
        }
    }
}