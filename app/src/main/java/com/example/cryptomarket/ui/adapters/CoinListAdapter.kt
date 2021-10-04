package com.example.cryptomarket.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cryptomarket.model.Coin
import android.view.RoundedCorner
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.example.cryptomarket.R


class CoinListAdapter:RecyclerView.Adapter<FeedListViewHolder>()  {
    val elementList: MutableList<Coin> = mutableListOf()

    fun addAll(newElementList: MutableList<Coin>) {
        elementList.clear()
        elementList.addAll(newElementList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeedListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_feed, parent, false)
        return FeedListViewHolder(view)
    }


    override fun onBindViewHolder(holder: FeedListViewHolder, position: Int) {
        holder.bind(elementList[position])

    }

    override fun getItemCount(): Int {
        return elementList.size

    }
}

class FeedListViewHolder(val itemView: View): RecyclerView.ViewHolder(itemView) {
    private val logo = itemView.findViewById<ImageView>(R.id.coinlogo)
    private val coinName = itemView.findViewById<TextView>(R.id.coinname)
    private val coinDesc = itemView.findViewById<TextView>(R.id.coinshort)
    private val coinVal = itemView.findViewById<TextView>(R.id.coinval)

    fun bind(coin: Coin) {
        Glide.with(itemView)
            .load(coin.imageUrl)
            .transform(CenterCrop(),RoundedCorners(24))
            .into(logo)
        coinName.text = coin.coinName
        coinDesc.text = coin.shortDescription
        coinVal.text = "${coin.price} $"
    }
}