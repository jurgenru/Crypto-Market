package com.example.cryptomarket.data.wallet.network

import com.example.cryptomarket.model.Coin
import com.example.cryptomarket.model.OwnedCoin
import retrofit2.http.GET

interface WalletAPI {
    @GET("/wallet")
    suspend fun getAllOwned(): List<OwnedCoin>
}