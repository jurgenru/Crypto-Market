package com.example.cryptomarket.ui.mainmenu.tabs.news.listadapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.example.cryptomarket.R
import com.example.cryptomarket.databinding.ListItemTrendsBinding
import com.example.cryptomarket.model.Trend

class TrendListAdapter : RecyclerView.Adapter<TrendListViewHolder>() {
    val elementList: MutableList<Trend> = mutableListOf()

    fun addAll(newElementList: List<Trend>) {
        elementList.clear()
        elementList.addAll(newElementList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrendListViewHolder {
        val binding =
            ListItemTrendsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TrendListViewHolder(binding)
    }


    override fun onBindViewHolder(holder: TrendListViewHolder, position: Int) {
        holder.bind(elementList[position])

    }

    override fun getItemCount(): Int {
        return elementList.size

    }
}

class TrendListViewHolder(val binding: ListItemTrendsBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun bind(trend: Trend) {
        Glide.with(itemView)
            .load(trend.icon)
            .transform(CenterCrop(), RoundedCorners(24))
            .into(binding.coinlogo)
        binding.coinname.text = trend.name
        binding.coinshort.text = trend.desc
        binding.tvLastPrice.text = "${trend.lastPrice} $"
        binding.tvChangePrice.text = "${trend.changes} %"
        Glide.with(itemView)
            .load(trend.markets)
            .transform(CenterCrop(), RoundedCorners(24))
            .into(binding.ivMarket)
    }
}