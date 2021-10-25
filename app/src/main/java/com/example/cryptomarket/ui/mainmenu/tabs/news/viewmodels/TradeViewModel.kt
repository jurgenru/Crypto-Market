package com.example.cryptomarket.ui.mainmenu.tabs.news.viewmodels

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.cryptomarket.data.trade.TradesRepository
import com.example.cryptomarket.data.trade.network.TradesNetworkControllerImp
import com.example.cryptomarket.data.trade.persistency.TradesPersistencyControllerImp
import com.example.cryptomarket.model.Trade
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

class TradeViewModel: ViewModel() {
    val scope = CoroutineScope(Dispatchers.IO)
    val tradesRepository = TradesRepository(TradesNetworkControllerImp(), TradesPersistencyControllerImp())

    val trades = MutableLiveData<List<Trade>>()

    fun getAllTrades(context: Context){
        tradesRepository.getAllTradeList(context).onEach {
            trades.postValue(it)
        }.launchIn(scope)
    }
}