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
import com.example.cryptomarket.interfaces.OnNewsItemClickListener
import com.example.cryptomarket.model.Post

class NewsListAdapter: RecyclerView.Adapter<NewsListViewHolder>() {
    private val elementList: MutableList<Post> = mutableListOf()
    private var onNewsItemClickListener: ((post: Post) -> Unit)? = null

    fun addAll(newElementList: List<Post>) {
        elementList.clear()
        elementList.addAll(newElementList)
        notifyDataSetChanged()
    }

    fun setOnNewsItemClickListener(onNewsItemClickListener: ((post: Post) -> Unit)?){
        this.onNewsItemClickListener = onNewsItemClickListener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_news, parent, false)
        return NewsListViewHolder(view)
    }

    override fun onBindViewHolder(holder: NewsListViewHolder, position: Int) {
        holder.bind(elementList[position])
        holder.itemView.setOnClickListener{
            onNewsItemClickListener?.invoke(elementList[position])
        }
    }

    override fun getItemCount(): Int {
        return elementList.size
    }

}

class NewsListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    private val ivImage = itemView.findViewById<ImageView>(R.id.ivImage)
    private val tvPostLastNews = itemView.findViewById<TextView>(R.id.tvPostLastNews)
    private val tvPostPublisher = itemView.findViewById<TextView>(R.id.tvPostPublisher)
    private val tvPostTime = itemView.findViewById<TextView>(R.id.tvPostTime)

    fun bind(post: Post){
        Glide.with(itemView)
            .load(post.imageUrl)
            .transform(CenterCrop(), RoundedCorners(24))
            .into(ivImage)
        tvPostLastNews.text = "Última hora"
        tvPostPublisher.text = post.publisher
        tvPostTime.text = "${post.time} min"
    }
}