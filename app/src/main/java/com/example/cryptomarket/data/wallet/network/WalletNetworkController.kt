package com.example.cryptomarket.data.wallet.network

import com.example.cryptomarket.model.OwnedCoin

interface WalletNetworkController {
    suspend fun getAllOwned(): List<OwnedCoin>
}