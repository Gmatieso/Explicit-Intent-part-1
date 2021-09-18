package com.example.intents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var editText1: TextView  // initializing  myString variable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText1 = findViewById(R.id.editText1)
    }
    fun askQuestion(view: View) {
        val i = Intent(this,ActivityB::class.java)
       val  myString  = editText1.text.toString()
        i.putExtra("qString",myString)
    }

}