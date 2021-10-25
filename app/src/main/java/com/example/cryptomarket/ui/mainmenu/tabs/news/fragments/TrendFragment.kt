package com.example.cryptomarket.ui.mainmenu.tabs.news.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cryptomarket.databinding.FragmentTrendBinding
import com.example.cryptomarket.ui.mainmenu.tabs.news.listadapters.TrendListAdapter
import com.example.cryptomarket.ui.mainmenu.tabs.news.viewmodels.TrendViewModel

class TrendFragment: Fragment() {
    private val trendListAdapter = TrendListAdapter()
    private lateinit var binding: FragmentTrendBinding
    private val trendViewModel: TrendViewModel by activityViewModels()

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

        trendViewModel.trends.observe(viewLifecycleOwner){
            trendListAdapter.addAll(it)
        }

        trendViewModel.getAllTrends(requireContext())
    }
}