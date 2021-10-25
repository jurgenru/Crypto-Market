package com.example.cryptomarket.data.news.network

import com.example.cryptomarket.model.Post
import retrofit2.http.GET

interface NewsAPI {
    @GET("/news")
    suspend fun getAllPosts(): List<Post>
}