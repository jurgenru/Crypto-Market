package com.example.cryptomarket.ui.mainmenu.tabs.feed

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.cryptomarket.data.feed.FeedRepository
import com.example.cryptomarket.data.feed.network.FeedNetworkController
import com.example.cryptomarket.data.feed.network.FeedNetworkControllerImp
import com.example.cryptomarket.data.feed.persistency.FeedPersistencyController
import com.example.cryptomarket.data.feed.persistency.FeedPersistencyControllerImp
import com.example.cryptomarket.data.news.NewsRepository
import com.example.cryptomarket.data.news.network.NewsNetworkControllerImp
import com.example.cryptomarket.data.news.persistency.NewsPersistencyControllerImp
import com.example.cryptomarket.model.Coin
import com.example.cryptomarket.model.Post
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

class FeedViewModel: ViewModel() {
    val scope = CoroutineScope(Dispatchers.IO)
    val feedRepository = FeedRepository(FeedNetworkControllerImp(),FeedPersistencyControllerImp())
    val coins = MutableLiveData<List<Coin>>()
    fun getAllCoins(context: Context){
        feedRepository.getAllCoinList(context).onEach {
            coins.postValue(it)
        }.launchIn(scope)
    }

}
