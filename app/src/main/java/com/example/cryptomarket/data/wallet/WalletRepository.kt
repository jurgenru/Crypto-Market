package com.example.cryptomarket.data.wallet

import android.content.Context
import com.example.cryptomarket.data.feed.network.FeedNetworkController
import com.example.cryptomarket.data.feed.persistency.FeedPersistencyController
import com.example.cryptomarket.data.wallet.network.WalletNetworkController
import com.example.cryptomarket.data.wallet.persistency.WalletPersistencyController

import com.example.cryptomarket.model.Coin
import com.example.cryptomarket.model.OwnedCoin
import com.example.cryptomarket.ui.isNetworkConnected
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class WalletRepository(val network: WalletNetworkController, val persistency: WalletPersistencyController) {
    fun getAllCoinList(context: Context):Flow<List<OwnedCoin>>{
        return flow{
            emit(persistency.getOwnedList())
            try{
                if(isNetworkConnected(context)){
                    val coins = network.getAllOwned()
                    persistency.saveOwned(coins)
                    emit(coins)
                }
            }catch (e:Exception){}
        }
    }




}
