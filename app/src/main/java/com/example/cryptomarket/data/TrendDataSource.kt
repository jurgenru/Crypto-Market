package com.example.cryptomarket.data

import com.example.cryptomarket.model.Trend

object TrendDataSource {
    val trendList = mutableListOf(
        Trend(
            icon = "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/BTC_Logo.svg/1200px-BTC_Logo.svg.png",
            name = "Bitcoin",
            desc = "BTN",
            lastPrice = 15.0,
            changes = 0.21,
            markets = "https://i-invdn-com.investing.com/news/LYNXNPEC410B3_S.jpg"
        ),
        Trend(
            icon = "https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/Ethereum_logo_2014.svg/1257px-Ethereum_logo_2014.svg.png",
            name = "Ethereum",
            desc = "ETH",
            lastPrice = 15.0,
            changes = 0.21,
            markets = "https://i-invdn-com.investing.com/news/LYNXNPEC410B3_S.jpg"
        ),
        Trend(
            icon = "https://www.seekpng.com/png/detail/308-3087811_dogecoin-logo-png-transparent-dogecoin.png",
            name = "Dogecoin",
            desc = "DGN",
            lastPrice = 15.0,
            changes = 0.21,
            markets = "https://i-invdn-com.investing.com/news/LYNXNPEC410B3_S.jpg"
        ),
    )
}