package com.example.cryptomarket.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import com.example.cryptomarket.R
import com.example.cryptomarket.data.NewsDataSource
import com.example.cryptomarket.databinding.FragmentNewsBinding
import com.example.cryptomarket.databinding.ListItemNewsBinding
import com.example.cryptomarket.ui.adapters.NewsListAdapter

class NewsFragment: Fragment() {
    private val newsListAdapter = NewsListAdapter()
    private lateinit var binding: FragmentNewsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNewsBinding.inflate(inflater, container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.rvNews.adapter = newsListAdapter

        val layoutManager = LinearLayoutManager(context,  LinearLayoutManager.HORIZONTAL, false)
        binding.rvNews.layoutManager = layoutManager

        LinearSnapHelper().attachToRecyclerView(binding.rvNews)

        newsListAdapter.addAll(NewsDataSource.postList)

        newsListAdapter.setOnNewsItemClickListener{
            val directions = NttsFragmentDirections.actionGoToNewsDetails(it)
            findNavController().navigate(directions)
        }
    }
}