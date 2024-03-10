package com.example.spotifyui

import android.os.Bundle
import android.view.inputmethod.EditorInfo
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import org.json.JSONException
import org.json.JSONObject

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeChoiceItems()
        initializeAlbumsRV()
        initializePopularAlbumsRV()
        initializeTrendingAlbumsRV()
        initializeSearchView()
    }

    private fun initializeSearchView() {
        val searchEdt: EditText = findViewById(R.id.idEdtSearch)
        searchEdt.setOnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                searchTracks(searchEdt.text.toString())
                true
            } else {
                false
            }
        }
    }

    private fun searchTracks(searchQuery: String) {
//        val intent = Intent(this@MainActivity, SearchActivity::class.java).apply {
//            putExtra("searchQuery", searchQuery)
//        }
//        startActivity(intent)
    }

    override fun onStart() {
        super.onStart()
    }
    private fun initializeAlbumsRV() {
        val albumsRV: RecyclerView = findViewById(R.id.idRVAlbums)
        val albumRVModalArrayList = ArrayList<AlbumRVModal>()
        val albumRVAdapter = AlbumRVAdapter(albumRVModalArrayList, this)
        albumsRV.adapter = albumRVAdapter
        for (i in 1..10) {
            albumRVModalArrayList.add(
                AlbumRVModal(
                    album_type = "Album Type $i",
                    artistName = "Artist $i",
                    external_ids = "External IDs $i",
                    external_urls = "External URLs $i",
                    href = "Href $i",
                    id = "ID $i",
                    imageUrl = "https://www.nicepng.com/png/full/175-1757222_music-art-png-music-and-arts-background.png",
                    label = "Label $i",
                    name = "Album Name $i",
                    popularity = i * 10,
                    release_date = "Release Date $i",
                    total_tracks = i * 2,
                    type = "Type $i"
                )
            )
        }
    }

    private fun initializePopularAlbumsRV() {
        val albumsRV: RecyclerView = findViewById(R.id.idRVPopularAlbums)
        val albumRVModalArrayList = ArrayList<AlbumRVModal>()
        val albumRVAdapter = AlbumRVAdapter(albumRVModalArrayList, this)
        albumsRV.adapter = albumRVAdapter
        for (i in 1..10) {
            albumRVModalArrayList.add(
                AlbumRVModal(
                    album_type = "Album Type $i",
                    artistName = "Artist $i",
                    external_ids = "External IDs $i",
                    external_urls = "External URLs $i",
                    href = "Href $i",
                    id = "ID $i",
                    imageUrl = "https://www.nicepng.com/png/full/175-1757222_music-art-png-music-and-arts-background.png",
                    label = "Label $i",
                    name = "Album Name $i",
                    popularity = i * 10,
                    release_date = "Release Date $i",
                    total_tracks = i * 2,
                    type = "Type $i"
                )
            )
        }

    }

    private fun initializeTrendingAlbumsRV() {
        val albumsRV: RecyclerView = findViewById(R.id.idRVTrendingAlbums)
        val albumRVModalArrayList = ArrayList<AlbumRVModal>()
        val albumRVAdapter = AlbumRVAdapter(albumRVModalArrayList, this)
        albumsRV.adapter = albumRVAdapter
        for (i in 1..10) {
            albumRVModalArrayList.add(
                AlbumRVModal(
                    album_type = "Album Type $i",
                    artistName = "Artist $i",
                    external_ids = "External IDs $i",
                    external_urls = "External URLs $i",
                    href = "Href $i",
                    id = "ID $i",
                    imageUrl = "https://www.nicepng.com/png/full/175-1757222_music-art-png-music-and-arts-background.png",
                    label = "Label $i",
                    name = "Album Name $i",
                    popularity = i * 10,
                    release_date = "Release Date $i",
                    total_tracks = i * 2,
                    type = "Type $i"
                )
            )
        }
    }
    private fun initializeChoiceItems() {
        val albumsRV: RecyclerView = findViewById(R.id.rv_choices)
        albumsRV.apply {
            layoutManager = GridLayoutManager(this@MainActivity,2)
        }
        val albumRVModalArrayList = ArrayList<ChoiceModal>()
        val albumRVAdapter = AlbumChoiceAdapter(albumRVModalArrayList, this)
        albumsRV.adapter = albumRVAdapter
        for (i in 1..6) {
            albumRVModalArrayList.add(
                ChoiceModal(
                    image = "uewhdiwenckqw",
                    titleName = "title $i"
                )
            )
        }
    }
}
