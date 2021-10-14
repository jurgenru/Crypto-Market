package com.example.cryptomarket.model

import java.io.Serializable

data class Post(
    val publisher: String,
    val time: Long,
    val imageUrl: String,
    val description: String,
    val full: String
) : Serializable
