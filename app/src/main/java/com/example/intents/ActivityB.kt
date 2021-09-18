package com.example.intents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent
import android.widget.TextView

class ActivityB : AppCompatActivity() {
    lateinit var textView2: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        val  extras = intent.extras ?:return
        val qString = extras.getString("qString")
        textView2 = findViewById<TextView>(R.id.textView2)
        textView2.text = qString
    }
}