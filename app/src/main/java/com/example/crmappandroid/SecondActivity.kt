package com.example.crmappandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.util.Random

class SecondActivity : AppCompatActivity() {
    private lateinit var textViewLabel: TextView
    private lateinit var textViewRandom: TextView

    companion object {
        const val TOTAL_COUNT = "total_count"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        textViewLabel = findViewById(R.id.textViewLabel)
        textViewRandom = findViewById(R.id.textViewRandom)
        showRandomNumber()
    }

    private fun showRandomNumber() {
        val count = intent.getIntExtra(TOTAL_COUNT, 0)
        val random = Random()
        var randomInt = 0
        if (count > 0) {
            randomInt = random.nextInt(count + 1)
        }
        textViewRandom.text = Integer.toString(randomInt)
        textViewLabel.text = getString(R.string.title_random_number, count)
    }
}