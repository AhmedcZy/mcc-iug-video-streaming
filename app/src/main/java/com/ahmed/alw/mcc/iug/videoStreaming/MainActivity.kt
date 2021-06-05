package com.ahmed.alw.mcc.iug.videoStreaming

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ahmed.alw.mcc.iug.videoStreaming.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = Intent(this, VideoPlayerActivity::class.java)

        video1.setOnClickListener {
            VideoPlayerActivity.URL = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/WeAreGoingOnBullrun.mp4"
            startActivity(intent)
        }

        video2.setOnClickListener {
            VideoPlayerActivity.URL = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/WhatCarCanYouGetForAGrand.mp4"
            startActivity(intent)
        }

        video3.setOnClickListener {
            VideoPlayerActivity.URL = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/TearsOfSteel.mp4"
            startActivity(intent)
        }

        video4.setOnClickListener {
            VideoPlayerActivity.URL = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/SubaruOutbackOnStreetAndDirt.mp4"
            startActivity(intent)
        }
    }

}

