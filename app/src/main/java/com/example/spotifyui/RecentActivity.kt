package com.example.spotifyui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.recyclerview.widget.RecyclerView

class RecentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recent)
        initializeAlbumsRV()
        findViewById<ImageButton>(R.id.back_btn).setOnClickListener {
            finish()
        }
    }
    private fun initializeAlbumsRV() {
        val albumsRV: RecyclerView = findViewById(R.id.songName)
        val albumRVModalArrayList = ArrayList<SongModal>()
        val albumRVAdapter = RecentItemAdapter(albumRVModalArrayList, this)
        albumsRV.adapter = albumRVAdapter
        for (i in 1..10) {
            albumRVModalArrayList.add(
                SongModal(
                    imageUrl = "njfekrnck",
                    title = "title $i",
                    subTitle = "subTitle $i"
                )
            )
        }
    }
}