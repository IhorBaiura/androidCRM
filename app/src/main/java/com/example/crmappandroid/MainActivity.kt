package com.example.crmappandroid

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.ComponentActivity
import android.widget.Toast

class MainActivity : ComponentActivity() {
    private lateinit var textViewTitle: TextView
    private lateinit var textViewMessage: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textViewTitle = findViewById(R.id.textViewTitle)
        textViewMessage = findViewById(R.id.textViewMessage)
    }

    fun getProfile(view: View) {
        val profileIntent = Intent(this, ThirdActivity::class.java)
        startActivity(profileIntent)
    }

    fun countMe (view: View) {
        textViewTitle.text = getString(R.string.score)
        val countString = textViewMessage.text.toString()
        var count: Int = countString.toIntOrNull() ?: 0
        count++
        textViewMessage.text = count.toString()
    }

    fun getMessage (view: View) {
        val countString = textViewMessage.text.toString()
        var count: Int = countString.toIntOrNull() ?: 0
        val randomIntent = Intent(this, SecondActivity::class.java)
        randomIntent.putExtra(SecondActivity.TOTAL_COUNT, count)
        startActivity(randomIntent)
        textViewTitle.text = getString(R.string.greeting)
        textViewMessage.text = getString(R.string.message)
    }
}
