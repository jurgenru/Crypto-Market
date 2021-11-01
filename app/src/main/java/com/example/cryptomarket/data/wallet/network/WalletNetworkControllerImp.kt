package com.example.cryptomarket.data.wallet.network

import com.example.cryptomarket.model.OwnedCoin
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class WalletNetworkControllerImp: WalletNetworkController {
    val client = Retrofit.Builder().baseUrl("http://10.0.2.2:3000/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(WalletAPI::class.java)

    override suspend fun getAllOwned(): List<OwnedCoin> {
        return client.getAllOwned()
    }
}