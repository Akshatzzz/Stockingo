package com.example.spotifyui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class AlbumChoiceAdapter(private val albumRVModalArrayList: ArrayList<ChoiceModal>, private val context: Context) :
    RecyclerView.Adapter<AlbumChoiceAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumChoiceAdapter.ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.choice_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val albumRVModal = albumRVModalArrayList[position]
        Glide.with(context).load(R.drawable.image1).into(holder.albumIV)
        holder.albumNameTV.text = albumRVModal.titleName

        holder.itemView.setOnClickListener {
            // mot required for now
        }
    }

    override fun getItemCount(): Int {
        return albumRVModalArrayList.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val albumIV: ImageView = itemView.findViewById(R.id.imageView)
        val albumNameTV: TextView = itemView.findViewById(R.id.textView)
    }
}
