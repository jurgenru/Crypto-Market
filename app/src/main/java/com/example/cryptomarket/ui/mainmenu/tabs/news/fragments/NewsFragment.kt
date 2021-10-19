package com.example.cryptomarket.ui.mainmenu.tabs.news.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import com.example.cryptomarket.databinding.FragmentNewsBinding
import com.example.cryptomarket.ui.mainmenu.tabs.news.NttsFragmentDirections
import com.example.cryptomarket.ui.mainmenu.tabs.news.listadapters.NewsListAdapter
import com.example.cryptomarket.ui.mainmenu.tabs.news.viewmodels.PostViewModel

class NewsFragment: Fragment() {
    private val newsListAdapter = NewsListAdapter()
    private lateinit var binding: FragmentNewsBinding
    private val postViewModel: PostViewModel by activityViewModels()

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

        newsListAdapter.setOnNewsItemClickListener{
            val directions = NttsFragmentDirections.actionGoToNewsDetails(it)
            findNavController().navigate(directions)
        }

        postViewModel.posts.observe(viewLifecycleOwner){
            newsListAdapter.addAll(it)
        }
    }
}