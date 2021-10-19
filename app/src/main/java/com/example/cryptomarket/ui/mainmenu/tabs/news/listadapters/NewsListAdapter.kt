package com.example.cryptomarket.ui.mainmenu.tabs.news.listadapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.example.cryptomarket.databinding.ListItemNewsBinding
import com.example.cryptomarket.model.Post

class NewsListAdapter : RecyclerView.Adapter<NewsListViewHolder>() {
    private val elementList: MutableList<Post> = mutableListOf()
    private var onNewsItemClickListener: ((post: Post) -> Unit)? = null

    fun addAll(newElementList: List<Post>) {
        elementList.clear()
        elementList.addAll(newElementList)
        notifyDataSetChanged()
    }

    fun setOnNewsItemClickListener(onNewsItemClickListener: ((post: Post) -> Unit)?) {
        this.onNewsItemClickListener = onNewsItemClickListener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsListViewHolder {
        val binding =
            ListItemNewsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return NewsListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: NewsListViewHolder, position: Int) {
        holder.bind(elementList[position])
        holder.binding.root.setOnClickListener {
            onNewsItemClickListener?.invoke(elementList[position])
        }
    }

    override fun getItemCount(): Int {
        return elementList.size
    }

}

class NewsListViewHolder(val binding: ListItemNewsBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(post: Post) {
        Glide.with(itemView)
            .load(post.imageUrl)
            .transform(CenterCrop(), RoundedCorners(24))
            .into(binding.ivImage)
        binding.tvPostLastNews.text = "Última hora"
        binding.tvPostPublisher.text = post.publisher
        binding.tvPostTime.text = "${post.time} min"
    }
}