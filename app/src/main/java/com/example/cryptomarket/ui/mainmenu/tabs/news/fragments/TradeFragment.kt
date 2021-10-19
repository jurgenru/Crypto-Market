package com.example.cryptomarket.ui.mainmenu.tabs.news.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import com.example.cryptomarket.databinding.FragmentTradesBinding
import com.example.cryptomarket.ui.mainmenu.tabs.news.listadapters.TradesListAdapter
import com.example.cryptomarket.ui.mainmenu.tabs.news.viewmodels.TradeViewModel

class TradeFragment : Fragment() {
    private val tradeListAdapter = TradesListAdapter()
    private lateinit var binding: FragmentTradesBinding
    private val tradeViewModel: TradeViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTradesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.rvTrades.adapter = tradeListAdapter

        val layoutManager =
            GridLayoutManager(context, 2, GridLayoutManager.VERTICAL, false)
        binding.rvTrades.layoutManager = layoutManager

        LinearSnapHelper().attachToRecyclerView(binding.rvTrades)

        tradeViewModel.trades.observe(viewLifecycleOwner){
            tradeListAdapter.addAll(it)
        }
    }
}