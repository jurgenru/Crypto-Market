package com.example.cryptomarket.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import com.example.cryptomarket.R
import com.example.cryptomarket.data.NewsDataSource
import com.example.cryptomarket.ui.adapters.NewsListAdapter

class NewsFragment: Fragment() {
    private val newsListAdapter = NewsListAdapter()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_news, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val recyclerView = view.findViewById<RecyclerView>(R.id.rvNews)
        recyclerView.adapter = newsListAdapter

        val layoutManager = LinearLayoutManager(context,  LinearLayoutManager.HORIZONTAL, false)
        recyclerView.layoutManager = layoutManager

        LinearSnapHelper().attachToRecyclerView(recyclerView)

        newsListAdapter.addAll(NewsDataSource.postList)

        newsListAdapter.setOnNewsItemClickListener{
            val ft = parentFragmentManager.beginTransaction()
            ft.add(R.id.container, PostNewsDetailsFragment())
            ft.addToBackStack("Test")
            ft.commit()
        }
    }
}