package com.example.testvideo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            label1.text = "Text Has Changed"
        }

        video1.settings.javaScriptEnabled = true
        video1.loadUrl("https://www.youtube.com/embed/Z4OhbzSFpnk?rel=0")

    }

}
