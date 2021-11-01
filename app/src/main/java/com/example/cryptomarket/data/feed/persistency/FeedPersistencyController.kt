package com.example.cryptomarket.data.feed.persistency

import com.example.cryptomarket.model.Coin

interface FeedPersistencyController {
    fun getCoinsList(): List<Coin>
    fun saveCoin(coins: List<Coin>)

}

//    val coinList = mutableListOf(
//        Coin(
//            coinName = "Bitcoin",
//            shortDescription = "BTC",
//            imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/BTC_Logo.svg/1200px-BTC_Logo.svg.png",
//            price = 1500.3,
//        ),
//        Coin(
//            coinName = "Ethereum",
//            shortDescription = "ETH",
//            imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/Ethereum_logo_2014.svg/1257px-Ethereum_logo_2014.svg.png",
//            price = 200.3,
//        ),
//        Coin(
//            coinName = "Dogecoin",
//            shortDescription = "DOGE",
//            imageUrl = "https://www.seekpng.com/png/detail/308-3087811_dogecoin-logo-png-transparent-dogecoin.png",
//            price = 1500.3,
//        ),
//        Coin(
//            coinName = "Bitcoin",
//            shortDescription = "BTC",
//            imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/BTC_Logo.svg/1200px-BTC_Logo.svg.png",
//            price = 1500.3,
//        ),
//        Coin(
//            coinName = "Ethereum",
//            shortDescription = "ETH",
//            imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/Ethereum_logo_2014.svg/1257px-Ethereum_logo_2014.svg.png",
//            price = 200.3,
//        ),
//        Coin(
//            coinName = "Dogecoin",
//            shortDescription = "DOGE",
//            imageUrl = "https://www.seekpng.com/png/detail/308-3087811_dogecoin-logo-png-transparent-dogecoin.png",
//            price = 1500.3,
//        )
//    )
//    fun getCoinsList():List<Coin>{
//        return coinList;
//    }