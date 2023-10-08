package com.huudung.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() { //Update value of id.textView
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = Dice(6).roll().toString()
    }
}

class Dice(private val numSides: Int) {
    fun roll(): Int { //random 1 to numSides
        return (1..numSides).random()
    }
}