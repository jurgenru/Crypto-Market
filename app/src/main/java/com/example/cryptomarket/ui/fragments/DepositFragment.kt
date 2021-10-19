package com.example.cryptomarket.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.NavArgs
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.example.cryptomarket.R
import com.example.cryptomarket.data.FeedDataSource
import com.example.cryptomarket.databinding.FragmentDepositBinding
import com.example.cryptomarket.databinding.FragmentFeedBinding
import com.example.cryptomarket.model.Coin
import com.example.cryptomarket.model.Post
import com.example.cryptomarket.ui.adapters.CoinListAdapter


class DepositFragment: Fragment() {

    private lateinit var coins: Coin
    private val arg: CoinDetailsFragmentArgs by navArgs()
    private lateinit var binding: FragmentDepositBinding



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //return inflater.inflate(R.layout.fragment_deposit, container, false)
        binding = FragmentDepositBinding.inflate(inflater, container,false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//


    }



}
