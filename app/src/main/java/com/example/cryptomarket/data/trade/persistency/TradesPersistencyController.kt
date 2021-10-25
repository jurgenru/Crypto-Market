package com.example.cryptomarket.data.trade.persistency

import com.example.cryptomarket.model.Trade

interface TradesPersistencyController {
    fun getTradeList(): List<Trade>
    fun saveTrade(trades: List<Trade>)
}