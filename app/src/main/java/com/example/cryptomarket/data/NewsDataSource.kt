package com.example.cryptomarket.data

import com.example.cryptomarket.model.Post

object NewsDataSource {
    private var postList = mutableListOf(
        Post(
            publisher = "Jürgen Ruegenberg Buezo",
            time = 15,
            imageUrl = "https://i-invdn-com.investing.com/news/LYNXNPEC410B3_S.jpg",
            description = "Pequeña descripccion de la noticia",
            full = "Noticia Completa"
        ),
        Post(
            publisher = "Otra persona",
            time = 30,
            imageUrl = "https://i-invdn-com.investing.com/news/LYNXNPEB701AO_S.jpg",
            description = "Pequeña descripccion de la noticia",
            full = "Noticia Completa"
        ),
        Post(
            publisher = "Otra otra persona",
            time = 50,
            imageUrl = "https://i-invdn-com.investing.com/news/LYNXMPEDAE0PJ-ORUBS_S.jpg",
            description = "Pequeña descripccion de la noticia",
            full = "Noticia Completa"
        ),
    )
    fun getPostList(): List<Post> {
        return postList
    }

    fun setPostList(postList: List<Post>){
        this.postList = postList.toMutableList()
    }
}