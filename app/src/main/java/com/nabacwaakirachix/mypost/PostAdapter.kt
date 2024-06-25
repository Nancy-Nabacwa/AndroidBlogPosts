package com.nabacwaakirachix.mypost

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PostAdapter (val postsList:List<Post>):RecyclerView.Adapter<PostsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostsViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.posts_list_item,parent,false)
        return PostsViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return postsList.count()
    }

    override fun onBindViewHolder(holder: PostsViewHolder, position: Int) {
        val post = postsList[position]
        holder.tvAuthorName.text = post.authorName
        holder.tvCatchPhrase.text = post.catchPhrase
        holder.tvPublishingDate.text = post.publishingDate
        holder.tvPostTitle.text = post.postTitle
        holder.tvPostDescription.text = post.postDescription
        holder.tvLink.text = post.fullPostLink
    }

}

class PostsViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var tvAuthorName = itemView.findViewById<TextView>(R.id.tvAuthorName)
    var tvCatchPhrase = itemView.findViewById<TextView>(R.id.tvPostPhrase)
    var tvPublishingDate = itemView.findViewById<TextView>(R.id.tvPublishDate)
    var tvPostTitle = itemView.findViewById<TextView>(R.id.tvMainPostTitle)
    var tvPostDescription = itemView.findViewById<TextView>(R.id.tvDescription)
    var tvLink = itemView.findViewById<TextView>(R.id.tvLinkToPost)
}