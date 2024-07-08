package com.nabacwaakirachix.mypost

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.nabacwaakirachix.mypost.databinding.PostsListItemBinding
import com.squareup.picasso.Picasso

class PostAdapter (val postsList:List<Post>):RecyclerView.Adapter<PostsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostsViewHolder {
        val binding = PostsListItemBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return PostsViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return postsList.count()
    }

    override fun onBindViewHolder(holder: PostsViewHolder, position: Int) {
        val post = postsList[position]
        holder.binding.tvAuthorName.text = post.authorName
        holder.binding.tvPublishDate.text = post.publishingDate
        holder.binding.tvMainPostTitle.text = post.postTitle
        holder.binding.tvDescription.text = post.postDescription.substring(0,100)
        Picasso.get()
            .load(post.articlePhoto)
            .placeholder(R.drawable.risotto_svgrepo_com__1_)
            .resize(400,120)
            .centerCrop()
            .into(holder.binding.ivPostImage)
        //holder.binding.ivPostImage.setImageResource(R.drawable.risotto_svgrepo_com__1_)
    }

}

class PostsViewHolder(var binding: PostsListItemBinding):RecyclerView.ViewHolder(binding.root)