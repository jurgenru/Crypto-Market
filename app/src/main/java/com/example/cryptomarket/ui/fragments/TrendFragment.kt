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
import com.example.cryptomarket.databinding.FragmentTrendBinding
import com.example.cryptomarket.ui.adapters.TrendListAdapter

class TrendFragment: Fragment() {
    private val trendListAdapter = TrendListAdapter()
    private lateinit var binding: FragmentTrendBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTrendBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.rvTrend.adapter = trendListAdapter

        val layoutManager = LinearLayoutManager(context,  LinearLayoutManager.VERTICAL, false)
        binding.rvTrend.layoutManager = layoutManager

        trendListAdapter.addAll(TrendDataSource.trendList)
    }
}