package com.example.crosszero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var cross = false
        var zero = false
        var gamescreen = Intent(this, GameActivity::class.java)

        buttonX.setOnClickListener {
            cross = true
            gamescreen.putExtra("crosstrue", cross)
            startActivity(gamescreen)
        }
        buttonO.setOnClickListener {
            zero = true
            gamescreen.putExtra("zerotrue", zero)
            startActivity(gamescreen)
        }

    }
}
