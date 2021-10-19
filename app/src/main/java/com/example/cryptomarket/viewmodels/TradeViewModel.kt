package com.example.cryptomarket.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.cryptomarket.data.TradeDataSource

class TradeViewModel: ViewModel() {
    val trades = MutableLiveData(TradeDataSource.getTradeList())
}