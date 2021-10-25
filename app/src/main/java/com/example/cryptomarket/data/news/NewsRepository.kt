package com.example.cryptomarket.data.news

import android.content.Context
import com.example.cryptomarket.data.news.network.NewsNetworkController
import com.example.cryptomarket.data.news.persistency.NewsPersistencyController
import com.example.cryptomarket.model.Post
import com.example.cryptomarket.ui.isNetworkConnected
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class NewsRepository(val network: NewsNetworkController, val persistency: NewsPersistencyController ) {
    fun getAllPostList(context: Context): Flow<List<Post>> {
        return flow {
            emit(persistency.getPostList())
            try {
                if(isNetworkConnected(context)){
                    val posts = network.getAllPosts()
                    persistency.savePost(posts)
                    emit(posts)
                }
            } catch (e: Exception){}
        }
    }
}