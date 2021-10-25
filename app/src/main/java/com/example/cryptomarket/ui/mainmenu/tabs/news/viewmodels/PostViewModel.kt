package com.example.cryptomarket.ui.mainmenu.tabs.news.viewmodels

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.cryptomarket.data.news.NewsRepository
import com.example.cryptomarket.data.news.network.NewsNetworkControllerImp
import com.example.cryptomarket.data.news.persistency.NewsPersistencyControllerImp
import com.example.cryptomarket.model.Post
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

class PostViewModel: ViewModel() {
    val scope = CoroutineScope(Dispatchers.IO)
    val newsRepository = NewsRepository(NewsNetworkControllerImp(), NewsPersistencyControllerImp())

    val posts = MutableLiveData<List<Post>>()

    fun getAllPosts(context: Context){
        newsRepository.getAllPostList(context).onEach {
            posts.postValue(it)
        }.launchIn(scope)
    }
}