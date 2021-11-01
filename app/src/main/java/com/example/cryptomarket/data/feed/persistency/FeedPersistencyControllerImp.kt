package com.example.cryptomarket.data.feed.persistency

import com.example.cryptomarket.model.Coin
import com.example.cryptomarket.model.Post

class FeedPersistencyControllerImp: FeedPersistencyController {
    private var coinList: List<Coin> = listOf()

    override fun getCoinsList(): List<Coin> {
        return coinList
    }

    override fun saveCoin(coins: List<Coin>){
        coinList = coins
    }
}