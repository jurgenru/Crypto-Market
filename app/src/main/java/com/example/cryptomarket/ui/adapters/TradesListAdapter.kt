package com.example.cryptomarket.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.cryptomarket.R
import com.example.cryptomarket.databinding.ListItemTradesBinding
import com.example.cryptomarket.model.Trade

class TradesListAdapter : RecyclerView.Adapter<TradesListViewHolder>() {
    val tradeList: MutableList<Trade> = mutableListOf()

    fun addAll(newElementList: List<Trade>) {
        tradeList.clear()
        tradeList.addAll(newElementList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TradesListViewHolder {
        val binding =
            ListItemTradesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TradesListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TradesListViewHolder, position: Int) {
        holder.bind(tradeList[position])
    }

    override fun getItemCount(): Int {
        return tradeList.size
    }

}

class TradesListViewHolder(val binding: ListItemTradesBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun bind(trade: Trade) {
        binding.tvAcronym.text = trade.acronym
        binding.tvPercentage.text = "${trade.percentage} %"
        binding.tvPrice.text = "${trade.price} %"
        binding.tvPricePercentage.text = "${trade.pricePercentage} %"
    }
}