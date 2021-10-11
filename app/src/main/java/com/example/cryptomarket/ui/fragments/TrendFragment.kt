package com.example.cryptomarket.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cryptomarket.R
import com.example.cryptomarket.data.TrendDataSource
import com.example.cryptomarket.ui.adapters.TrendListAdapter

class TrendFragment: Fragment() {
    private val trendListAdapter = TrendListAdapter()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_trend, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val recyclerView = view.findViewById<RecyclerView>(R.id.rvTrend)
        recyclerView.adapter = trendListAdapter

        recyclerView.layoutManager = LinearLayoutManager(context,  LinearLayoutManager.VERTICAL, false)

        trendListAdapter.addAll(TrendDataSource.trendList)
    }
}