package com.example.crmappandroid

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
        val mess = getString(R.string.profile_creating_message)
        val myToast = Toast.makeText(this, mess, Toast.LENGTH_SHORT)
        myToast.show()
    }

    fun countMe (view: View) {
        textViewTitle.text = getString(R.string.score)
        val countString = textViewMessage.text.toString()
        var count: Int = countString.toIntOrNull() ?: 0
        count++
        textViewMessage.text = count.toString()
    }

    fun getMessage (view: View) {
        textViewTitle.text = getString(R.string.greeting)
        textViewMessage.text = getString(R.string.message)
    }
}
