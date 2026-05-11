package com.example.musicapp

import android.animation.Animator
import android.util.Log

class Song (
    songName: String,
    songArtist: String,
    songYear: Int,
    songDuration: String) {
    // properties
    var name: String = ""
    var artist: String = ""
    var year: Int = 0
    var duration: String = ""

    init {
        name = songName
        artist = songArtist
        year = songYear
        duration = songDuration
    }
    fun Play() {
        Log.v("Song", "$name playing now")
    }

    fun Pause() {
        Log.v("Song", "$name paused now")
    }

    fun Stop(){
        Log.v("Song", "$name stopped now")
    }

    fun Favourite(): Boolean {
        Log.v("Song", "$name favourited now")
        return true
    }
}