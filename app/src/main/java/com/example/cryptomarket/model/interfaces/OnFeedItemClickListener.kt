package com.example.cryptomarket.model.interfaces

import com.example.cryptomarket.model.Coin
import com.example.cryptomarket.model.Post

interface OnFeedItemClickListener {
    fun onItemClick(coin: Coin)
}