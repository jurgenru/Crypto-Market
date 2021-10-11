package com.example.cryptomarket.ui.adapters

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
import com.example.cryptomarket.model.Trend

class TrendListAdapter:RecyclerView.Adapter<TrendListViewHolder>(){
    val elementList: MutableList<Trend> = mutableListOf()

    fun addAll(newElementList: MutableList<Trend>) {
        elementList.clear()
        elementList.addAll(newElementList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrendListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_trends, parent, false)
        return TrendListViewHolder(view)
    }


    override fun onBindViewHolder(holder: TrendListViewHolder, position: Int) {
        holder.bind(elementList[position])

    }

    override fun getItemCount(): Int {
        return elementList.size

    }
}

class TrendListViewHolder(val itemView: View): RecyclerView.ViewHolder(itemView) {
    private val logo = itemView.findViewById<ImageView>(R.id.coinlogo)
    private val coinName = itemView.findViewById<TextView>(R.id.coinname)
    private val coinDesc = itemView.findViewById<TextView>(R.id.coinshort)
    private val coinVal = itemView.findViewById<TextView>(R.id.tvLastPrice)
    private val changeVal = itemView.findViewById<TextView>(R.id.tvChangePrice)
    private val market = itemView.findViewById<ImageView>(R.id.ivMarket)

    fun bind(trend: Trend) {
        Glide.with(itemView)
            .load(trend.icon)
            .transform(CenterCrop(), RoundedCorners(24))
            .into(logo)
        coinName.text = trend.name
        coinDesc.text = trend.desc
        coinVal.text = "${trend.lastPrice} $"
        changeVal.text = "${trend.changes} %"
        Glide.with(itemView)
            .load(trend.markets)
            .transform(CenterCrop(), RoundedCorners(24))
            .into(market)
    }
}