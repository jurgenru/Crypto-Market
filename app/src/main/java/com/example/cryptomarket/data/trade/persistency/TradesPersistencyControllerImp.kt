package com.example.cryptomarket.data.trade.persistency

import com.example.cryptomarket.model.Trade

class TradesPersistencyControllerImp: TradesPersistencyController {
    private var tradeList: List<Trade> = listOf()

    override fun getTradeList(): List<Trade> {
        return tradeList
    }

    override fun saveTrade(trades: List<Trade>){
        tradeList = trades
    }
}