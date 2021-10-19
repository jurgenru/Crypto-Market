package com.example.cryptomarket.ui.mainmenu.tabs.news.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.cryptomarket.data.TrendDataSource

class TrendViewModel: ViewModel() {
    val trends = MutableLiveData(TrendDataSource.getTrendList())
}