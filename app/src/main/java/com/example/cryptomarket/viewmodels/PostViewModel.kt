package com.example.cryptomarket.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.cryptomarket.data.NewsDataSource

class PostViewModel: ViewModel() {
    val posts = MutableLiveData(NewsDataSource.getPostList())
}