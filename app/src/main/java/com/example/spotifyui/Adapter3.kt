package com.example.spotifyui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class RecentItemAdapter(private val albumRVModalArrayList: ArrayList<SongModal>, private val context: Context) :
    RecyclerView.Adapter<RecentItemAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecentItemAdapter.ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.recent_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val albumRVModal = albumRVModalArrayList[position]
        val drawable1 = when(position%7) {
            0 -> R.drawable.images
            1 -> R.drawable.arijit_singh
            2 -> R.drawable.image1
            3 -> R.drawable.shaan_image
            else -> R.drawable.coke_studio
        }
        Glide.with(context).load(drawable1).into(holder.albumIV1)
        holder.albumNameTV1.text = albumRVModal.title
        holder.albumSubTitleTV1.text = albumRVModal.subTitle

        val drawable2 = when((position + 2)%7) {
            0 -> R.drawable.images
            1 -> R.drawable.arijit_singh
            2 -> R.drawable.image1
            3 -> R.drawable.shaan_image
            else -> R.drawable.coke_studio
        }
        Glide.with(context).load(drawable2).into(holder.albumIV12)
        holder.albumNameTV2.text = albumRVModal.title
        holder.albumSubTitleTV2.text = albumRVModal.subTitle

        val drawable3 = when((position + 3)%7) {
            0 -> R.drawable.images
            1 -> R.drawable.arijit_singh
            2 -> R.drawable.image1
            3 -> R.drawable.shaan_image
            else -> R.drawable.coke_studio
        }
        Glide.with(context).load(drawable3).into(holder.albumIV3)
        holder.albumNameTV3.text = albumRVModal.title
        holder.albumSubTitleTV3.text = albumRVModal.subTitle

        val drawable4 = when((position + 4)%7) {
            0 -> R.drawable.images
            1 -> R.drawable.arijit_singh
            2 -> R.drawable.image1
            3 -> R.drawable.shaan_image
            else -> R.drawable.coke_studio
        }
        Glide.with(context).load(drawable4).into(holder.albumIV4)
        holder.albumNameTV4.text = albumRVModal.title
        holder.albumSubTitleTV4.text = albumRVModal.subTitle



        holder.itemView.setOnClickListener {
            // mot required for now
        }
    }

    override fun getItemCount(): Int {
        return albumRVModalArrayList.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val testView1 = itemView.findViewById<View>(R.id.test_view1)
        val albumIV1: ImageView = testView1.findViewById(R.id.imageViewAlbumArt)
        val albumNameTV1: TextView = testView1.findViewById(R.id.textViewSongTitle)
        val albumSubTitleTV1: TextView = testView1.findViewById(R.id.textViewSongArtist)

        private val testView2 = itemView.findViewById<View>(R.id.test_view2)
        val albumIV12: ImageView = testView2.findViewById(R.id.imageViewAlbumArt)
        val albumNameTV2: TextView = testView2.findViewById(R.id.textViewSongTitle)
        val albumSubTitleTV2: TextView = testView2.findViewById(R.id.textViewSongArtist)

        private val testView3 = itemView.findViewById<View>(R.id.test_view3)
        val albumIV3: ImageView = testView3.findViewById(R.id.imageViewAlbumArt)
        val albumNameTV3: TextView = testView3.findViewById(R.id.textViewSongTitle)
        val albumSubTitleTV3: TextView = testView3.findViewById(R.id.textViewSongArtist)

        private val testView4 = itemView.findViewById<View>(R.id.test_view4)
        val albumIV4: ImageView = testView4.findViewById(R.id.imageViewAlbumArt)
        val albumNameTV4: TextView = testView4.findViewById(R.id.textViewSongTitle)
        val albumSubTitleTV4: TextView = testView4.findViewById(R.id.textViewSongArtist)
    }
}
