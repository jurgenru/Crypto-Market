package com.example.cryptomarket.ui.mainmenu.tabs.feed

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cryptomarket.R
import com.example.cryptomarket.data.FeedDataSource

class FeedFragment: Fragment() {
    private val coinListAdapter = CoinListAdapter()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feed, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val recyclerView = view.findViewById<RecyclerView>(R.id.frv)
        recyclerView.adapter = coinListAdapter

        recyclerView.layoutManager = LinearLayoutManager(context,  LinearLayoutManager.VERTICAL, false)

        coinListAdapter.addAll(FeedDataSource.coinList)
    }
}

