package com.ds.aula03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    val button: Button = findViewById(R.id.button3)
    button.setOnClickListener{
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = "Olá Mundo"
        val rollButton: Button = findViewById(R.id.button3)
        rollButton.setOnClickListener{
            rollDice()
           /* val toast = Toast.makeText(this, "Rolou o dado!", Toast.LENGTH_SHORT).show()
            val resultTextView: TextView = findViewById(R.id.textView)
                resultTextView.text = "6"*/
        }

    }
    }
    class Dice(private val numSides: Int) {
        fun roll(): Int {
            return (1..numSides).random()
        }
    }
    private fun rollDice() {
        val dice = Dice(30)
        val diceRoll = dice.roll()
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
    }
}

