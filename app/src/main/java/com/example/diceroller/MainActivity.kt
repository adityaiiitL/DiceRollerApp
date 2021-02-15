package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //start coding here...
        val diceImageView=findViewById<ImageView>(R.id.dice_imageview)
        diceImageView.setImageResource(R.drawable.dice1)

        val rollbutton= findViewById<Button>(R.id.roll_button)
        rollbutton.setOnClickListener {
            val randomNumber= Random().nextInt(6)
            when(randomNumber){
                0 -> diceImageView.setImageResource(R.drawable.dice1)
                1 -> diceImageView.setImageResource(R.drawable.dice2)
                2 -> diceImageView.setImageResource(R.drawable.dice3)
                3 -> diceImageView.setImageResource(R.drawable.dice4)
                4 -> diceImageView.setImageResource(R.drawable.dice5)
                5 -> diceImageView.setImageResource(R.drawable.dice6)
            }
        }
    }
}