package com.example.cryptomarket.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cryptomarket.R
import com.example.cryptomarket.data.FeedDataSource
import com.example.cryptomarket.databinding.FragmentFeedBinding
import com.example.cryptomarket.databinding.FragmentNewsBinding
import com.example.cryptomarket.model.Post
import com.example.cryptomarket.ui.adapters.CoinListAdapter


class FeedFragment: Fragment() {
    private val coinListAdapter = CoinListAdapter()
    private lateinit var binding: FragmentFeedBinding



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFeedBinding.inflate(inflater, container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.frv.adapter =coinListAdapter;
        binding.frv.layoutManager = LinearLayoutManager(context,  LinearLayoutManager.VERTICAL, false)

        coinListAdapter.addAll(FeedDataSource.coinList)

        coinListAdapter.setOnFeedItemClickListener {
            //
            val directions = FeedFragmentDirections.actiontocoin(it);
            findNavController().navigate(directions)

        }

        binding.deposit
            .setOnClickListener {
            val directions = FeedFragmentDirections.actionFeedFragment2ToDepositFragment();
            findNavController().navigate(directions)
        }
    }
}

