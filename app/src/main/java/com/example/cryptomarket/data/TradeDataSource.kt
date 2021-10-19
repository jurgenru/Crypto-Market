package com.example.cryptomarket.data

import com.example.cryptomarket.model.Trade


object TradeDataSource {
    private var tradeList = mutableListOf(
        Trade(
            acronym = "BTN",
            price = 1521.0,
            percentage = 12.0,
            pricePercentage = 1521.12
        ),
        Trade(
            acronym = "HRC",
            price = 1521.0,
            percentage = 12.0,
            pricePercentage = 1521.12
        ),
        Trade(
            acronym = "OBJ",
            price = 1521.0,
            percentage = 12.0,
            pricePercentage = 1521.12
        ),
        Trade(
            acronym = "NTF",
            price = 1521.0,
            percentage = 12.0,
            pricePercentage = 1521.12
        ),
        Trade(
            acronym = "WPP",
            price = 1521.0,
            percentage = 12.0,
            pricePercentage = 1521.12
        ),
        Trade(
            acronym = "FCB",
            price = 1521.0,
            percentage = 12.0,
            pricePercentage = 1521.12
        )
    )
    fun getTradeList(): List<Trade> {
        return tradeList
    }

    fun setTradeList(tradeList: List<Trade>){
        this.tradeList = tradeList.toMutableList()
    }
}