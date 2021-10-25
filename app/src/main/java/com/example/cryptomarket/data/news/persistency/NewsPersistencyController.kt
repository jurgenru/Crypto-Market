package com.example.cryptomarket.data.news.persistency

import com.example.cryptomarket.model.Post

interface NewsPersistencyController {
    fun getPostList(): List<Post>
    fun savePost(posts: List<Post>)
}