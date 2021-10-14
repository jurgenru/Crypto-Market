package com.example.cryptomarket.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.example.cryptomarket.R
import com.example.cryptomarket.model.Post
import org.w3c.dom.Text

class PostNewsDetailsFragment : Fragment() {
    private lateinit var news: Post
    private val args: PostNewsDetailsFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_news_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val ivPostImage = view.findViewById<ImageView>(R.id.ivImgDetails)
        val tvPublisherPost = view.findViewById<TextView>(R.id.tvPostPublisher)
        val tvShortDescription = view.findViewById<TextView>(R.id.tvShortDescription)
        val tvTime = view.findViewById<TextView>(R.id.tvTimeNews)
        val tvFullNews = view.findViewById<TextView>(R.id.fullNews)

        news = args.post

        Glide.with(view).load(news.imageUrl).transform(CenterCrop(), RoundedCorners(24))
            .into(ivPostImage)
        tvPublisherPost.text = news.publisher
        tvShortDescription.text = news.description
        tvTime.text = "${news.time} min"
        tvFullNews.text = news.full
    }
}