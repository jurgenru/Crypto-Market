package com.example.cryptomarket.data.news.network

import com.example.cryptomarket.model.Post

interface NewsNetworkController {
    suspend fun getAllPosts(): List<Post>
}