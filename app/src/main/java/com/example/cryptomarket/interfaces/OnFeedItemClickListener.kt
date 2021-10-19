package com.example.cryptomarket.interfaces

import com.example.cryptomarket.model.Coin
import com.example.cryptomarket.model.Post

interface OnFeedItemClickListener {
    fun onItemClick(coin: Coin)
}