package com.example.cryptomarket.data.trade.network

import com.example.cryptomarket.model.Trade

interface TradesNetworkController {
    suspend fun getAllTrades(): List<Trade>
}