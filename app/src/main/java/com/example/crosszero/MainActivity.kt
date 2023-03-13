package com.example.crosszero

import android.content.Context.MODE_PRIVATE
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatDelegate
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var cross = false
        var zero = false
        var gamescreen = Intent(this, GameActivity::class.java)
        buttonX.setBackgroundColor(resources.getColor(R.color.pinkcream))
        buttonO.setBackgroundColor(resources.getColor(R.color.bluesky))
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

/*
        switchtheme.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                //switchtheme.text = "Dark"
                buttonView.textAlignment = View.TEXT_ALIGNMENT_TEXT_END
                buttonView.setTextColor(Color.WHITE)
                buttonView.text = "Dark"
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                val editor = getSharedPreferences("save", MODE_PRIVATE).edit()
                editor.putBoolean("value", true)
                editor.apply()
                switchtheme.isChecked = true
            }
            else
            {
                buttonView.text = "Light"
                buttonView.textAlignment = View.TEXT_ALIGNMENT_TEXT_END
                buttonView.setTextColor(Color.WHITE)
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                val editor = getSharedPreferences("save", MODE_PRIVATE).edit()
                editor.putBoolean("value", false)
                editor.apply()
                switchtheme.isChecked = false
            }
        }*/
    }
}




