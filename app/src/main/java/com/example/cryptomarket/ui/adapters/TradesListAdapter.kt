package com.example.cryptomarket.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.cryptomarket.R
import com.example.cryptomarket.model.Trade

class TradesListAdapter: RecyclerView.Adapter<TradesListViewHolder>() {
    val tradeList: MutableList<Trade> = mutableListOf()

    fun addAll(newElementList: List<Trade>) {
        tradeList.clear()
        tradeList.addAll(newElementList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TradesListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_trades, parent, false)
        return TradesListViewHolder(view)
    }

    override fun onBindViewHolder(holder: TradesListViewHolder, position: Int) {
        holder.bind(tradeList[position])
    }

    override fun getItemCount(): Int {
        return tradeList.size
    }

}

class TradesListViewHolder(val itemView: View): RecyclerView.ViewHolder(itemView){
    private val tvAcronym = itemView.findViewById<TextView>(R.id.tvAcronym)
    private val tvPercentage = itemView.findViewById<TextView>(R.id.tvPercentage)
    private val tvPrice = itemView.findViewById<TextView>(R.id.tvPrice)
    private val tvPricePercentage = itemView.findViewById<TextView>(R.id.tvPricePercentage)

    fun bind(trade: Trade){
        tvAcronym.text = trade.acronym
        tvPercentage.text = "${trade.percentage} %"
        tvPrice.text = "${trade.price} %"
        tvPricePercentage.text = "${trade.pricePercentage} %"
    }
}