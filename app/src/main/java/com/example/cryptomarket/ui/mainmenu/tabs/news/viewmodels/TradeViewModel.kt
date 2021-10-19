package com.example.cryptomarket.ui.mainmenu.tabs.news.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.cryptomarket.data.TradeDataSource

class TradeViewModel: ViewModel() {
    val trades = MutableLiveData(TradeDataSource.getTradeList())
}