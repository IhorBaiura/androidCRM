package com.example.crmappandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val rootLayout: ConstraintLayout = findViewById(R.id.profileLayoutRoot)
        val textView: TextView = findViewById(R.id.textViewSelectedColor)
        val redButton: Button = findViewById(R.id.button_red)
        val yellowButton: Button = findViewById(R.id.button_yellow)
        val greenButton: Button = findViewById(R.id.button_green)

        redButton.setOnClickListener {
            textView.setText(R.string.red)
            rootLayout.setBackgroundColor(resources.getColor(R.color.redColor,
                null))
        }

        yellowButton.setOnClickListener {
            textView.setText(R.string.yellow)
            rootLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.yellowColor))
        }

        greenButton.setOnClickListener {
            textView.text = resources.getText(R.string.green)
            rootLayout.setBackgroundColor(resources.getColor(R.color.greenColor,
                null))
        }
    }
}