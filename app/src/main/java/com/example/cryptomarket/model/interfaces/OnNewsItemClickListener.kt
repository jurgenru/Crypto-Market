package com.example.cryptomarket.model.interfaces

import com.example.cryptomarket.model.Post

interface OnNewsItemClickListener {
    fun onItemClick(post: Post)
}