package com.example.cryptomarket.data.wallet.persistency

import com.example.cryptomarket.model.Coin
import com.example.cryptomarket.model.OwnedCoin

class WalletPersistencyControllerImp: WalletPersistencyController {
    private var ownedList: List<OwnedCoin> = listOf()

    override fun getOwnedList(): List<OwnedCoin> {
        return ownedList
    }

    override fun saveOwned(owned: List<OwnedCoin>){
        ownedList = owned
    }
}