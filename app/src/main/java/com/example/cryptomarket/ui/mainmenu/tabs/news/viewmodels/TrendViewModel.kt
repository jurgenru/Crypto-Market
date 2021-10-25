package com.example.cryptomarket.ui.mainmenu.tabs.news.viewmodels

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.cryptomarket.data.trend.TrendsRepository
import com.example.cryptomarket.data.trend.network.TrendsNetworkControllerImp
import com.example.cryptomarket.data.trend.persistency.TrendsPersistencyControllerImp
import com.example.cryptomarket.model.Trend
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

class TrendViewModel: ViewModel() {
    val scope = CoroutineScope(Dispatchers.IO)
    val trendsRepository = TrendsRepository(TrendsNetworkControllerImp(), TrendsPersistencyControllerImp())

    val trends = MutableLiveData<List<Trend>>()

    fun getAllTrends(context: Context){
        trendsRepository.getAllTrendList(context).onEach {
            trends.postValue(it)
        }.launchIn(scope)
    }
}