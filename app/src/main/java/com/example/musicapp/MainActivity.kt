package com.example.musicapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val song1 = Song("Soft Life", "Nomfundo Moh", 2022, "4:08")
        val song2 = Song("10,000 days (wings Pt2)", "Tool", 2006, "11:30")
        val song3 = Song("Just a little tune", "Some Birdy Tweeted")

        setContentView(R.layout.activity_main)

        // Find views and set initial song data
        val titleView = findViewById<android.widget.TextView>(R.id.songTitle)
        val artistView = findViewById<android.widget.TextView>(R.id.songArtist)
        
        titleView.text = song1.name
        artistView.text = song1.artist

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}