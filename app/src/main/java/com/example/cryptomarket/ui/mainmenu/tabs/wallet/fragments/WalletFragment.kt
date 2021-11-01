package com.example.cryptomarket.ui.mainmenu.tabs.wallet.fragments

import WalletListAdapter
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cryptomarket.R
import com.example.cryptomarket.databinding.FragmentFeedBinding
import com.example.cryptomarket.databinding.FragmentWalletBinding

import com.example.cryptomarket.ui.mainmenu.tabs.wallet.WalletViewModel

class WalletFragment: Fragment() {
    private val walletListAdapter = WalletListAdapter()
    private lateinit var binding: FragmentWalletBinding
    private val walletViewModel: WalletViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWalletBinding.inflate(inflater, container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.wallrecycle.adapter=walletListAdapter;
        binding.wallrecycle.layoutManager = LinearLayoutManager(context,  LinearLayoutManager.VERTICAL, false)


        walletViewModel.coins.observe(viewLifecycleOwner){
            walletListAdapter.addAll(it)
        }

        walletViewModel.getAllCoins(requireContext())



    }


}