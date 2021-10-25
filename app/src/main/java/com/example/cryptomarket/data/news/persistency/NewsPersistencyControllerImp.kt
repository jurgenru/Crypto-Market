package com.example.cryptomarket.data.news.persistency

import com.example.cryptomarket.model.Post

class NewsPersistencyControllerImp: NewsPersistencyController {
    private var postList: List<Post> = listOf()

    override fun getPostList(): List<Post> {
        return postList
    }

    override fun savePost(posts: List<Post>){
        postList = posts
    }
}