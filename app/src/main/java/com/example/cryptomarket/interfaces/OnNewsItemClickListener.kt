package com.example.cryptomarket.interfaces

import com.example.cryptomarket.model.Post

interface OnNewsItemClickListener {
    fun onItemClick(post: Post)
}