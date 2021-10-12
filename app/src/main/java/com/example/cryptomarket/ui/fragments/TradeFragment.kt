package com.example.cryptomarket.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cryptomarket.R
import com.example.cryptomarket.data.TradeDataSource
import com.example.cryptomarket.ui.adapters.TradesListAdapter

class TradeFragment : Fragment() {
    private val tradeListAdapter = TradesListAdapter()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_trades, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val recyclerView = view.findViewById<RecyclerView>(R.id.rvTrades)
        recyclerView.adapter = tradeListAdapter

        recyclerView.layoutManager =
            GridLayoutManager(context, 2, GridLayoutManager.VERTICAL, false)

        tradeListAdapter.addAll(TradeDataSource.tradeList)
    }
}