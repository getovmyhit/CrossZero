package com.example.crosszero

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import android.graphics.ColorSpace
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_game.*

@Suppress("DEPRECATION")
class GameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
        var restart = Intent(this, MainActivity::class.java)
        val builder = AlertDialog.Builder(this)
        var winner =""
        val gamerZero = "ZERO"
        val gamerCross = "CROSS"
        var stateZero = intent.getBooleanExtra("zerotrue", false)
        var stateCross = intent.getBooleanExtra("crosstrue", false)
        fun checkWin(whoiswin: String){
            when {
                button11.text != "" && button11.text == button12.text && button11.text == button13.text ->{
                    txtvictory.text = txtvictory.text.toString()
                    txtwhoiswin.text = "$whoiswin"
                    winner = whoiswin}
                button11.text != "" && button11.text == button21.text && button11.text == button31.text ->{
                    txtvictory.text = txtvictory.text.toString()
                    txtwhoiswin.text = "$whoiswin"
                    winner = whoiswin}
                button11.text != "" && button11.text == button22.text && button11.text == button33.text ->{
                    txtvictory.text = txtvictory.text.toString()
                    txtwhoiswin.text = "$whoiswin"
                    winner = whoiswin}
                button12.text != "" && button12.text == button22.text && button12.text == button32.text->{
                    txtvictory.text = txtvictory.text.toString()
                    txtwhoiswin.text = "$whoiswin"
                    winner = whoiswin}
                button13.text != "" && button13.text == button23.text && button13.text == button33.text ->{
                    txtvictory.text = txtvictory.text.toString()
                    txtwhoiswin.text = "$whoiswin"
                    winner = whoiswin}
                button21.text != "" && button21.text == button22.text && button21.text == button23.text->{
                    txtvictory.text = txtvictory.text.toString()
                    txtwhoiswin.text = "$whoiswin"
                    winner = whoiswin}
                button31.text != "" && button31.text == button22.text && button31.text == button13.text ->{
                    txtvictory.text = txtvictory.text.toString()
                    txtwhoiswin.text = "$whoiswin"
                    winner = whoiswin}
                button31.text != "" && button31.text == button32.text && button31.text == button33.text ->{
                    txtvictory.text = txtvictory.text.toString()
                    txtwhoiswin.text = "$whoiswin"
                    winner = whoiswin}
                button11.text != "" && button12.text != "" && button13.text != "" && button21.text != "" && button22.text != "" && button23.text != "" && button31.text != "" && button32.text != "" && button33.text != ""
                ->
                {
                    winner =""
                }
            }
            when {
                winner==gamerZero -> builder.setMessage("ПОБЕДИЛ ИГРОК: $gamerZero! \n\nНачать новую игру?")
                winner==gamerCross -> builder.setMessage("ПОБЕДИЛ ИГРОК: $gamerCross! \n\nНачать новую игру?")
                winner.isEmpty()-> builder.setMessage("НИЧЬЯ! \n\nНачать новую игру?")
                else -> {}
            }
            builder.setIcon(android.R.drawable.ic_dialog_info)
                .setPositiveButton("Да", DialogInterface.OnClickListener { dialog, which ->  startActivity(restart)
                })
                .setNegativeButton("Нет", DialogInterface.OnClickListener { dialog, which -> finishAffinity()
                })
                .create()
        }
        fun colourWin() {
            if (button11.text != "" && button11.text == button12.text && button11.text == button13.text)
            {
                button11.setBackgroundColor(resources.getColor(R.color.red, null))
                button12.setBackgroundColor(resources.getColor(R.color.red, null))
                button13.setBackgroundColor(resources.getColor(R.color.red, null))
                button21.isEnabled=false
                button22.isEnabled=false
                button23.isEnabled=false
                button31.isEnabled=false
                button32.isEnabled=false
                button33.isEnabled=false
                txtvictory.isVisible=true
                txtwhoiswin.isVisible=true
                android.os.Handler().postDelayed({ builder.show()}, 2000)
            }
            if (button11.text != "" && button11.text == button21.text && button11.text == button31.text)
            {
                button11.setBackgroundColor(resources.getColor(R.color.red, null))
                button21.setBackgroundColor(resources.getColor(R.color.red, null))
                button31.setBackgroundColor(resources.getColor(R.color.red, null))
                button12.isEnabled=false
                button13.isEnabled=false
                button22.isEnabled=false
                button23.isEnabled=false
                button32.isEnabled=false
                button33.isEnabled=false
                txtvictory.isVisible=true
                txtwhoiswin.isVisible=true
                android.os.Handler().postDelayed({ builder.show()}, 2000)
            }
            if (button11.text != "" && button11.text == button22.text && button11.text == button33.text )
            {
                button11.setBackgroundColor(resources.getColor(R.color.red, null))
                button22.setBackgroundColor(resources.getColor(R.color.red, null))
                button33.setBackgroundColor(resources.getColor(R.color.red, null))
                button12.isEnabled=false
                button13.isEnabled=false
                button21.isEnabled=false
                button23.isEnabled=false
                button31.isEnabled=false
                button32.isEnabled=false
                txtvictory.isVisible=true
                txtwhoiswin.isVisible=true
                android.os.Handler().postDelayed({ builder.show()}, 2000)
            }
            if (button12.text != "" && button12.text == button22.text && button12.text == button32.text)
            {
                button12.setBackgroundColor(resources.getColor(R.color.red, null))
                button22.setBackgroundColor(resources.getColor(R.color.red, null))
                button32.setBackgroundColor(resources.getColor(R.color.red, null))
                button11.isEnabled=false
                button13.isEnabled=false
                button21.isEnabled=false
                button23.isEnabled=false
                button31.isEnabled=false
                button33.isEnabled=false
                txtvictory.isVisible=true
                txtwhoiswin.isVisible=true
                android.os.Handler().postDelayed({ builder.show()}, 2000)
            }
            if (button13.text != "" && button13.text == button23.text && button13.text == button33.text)
            {
                button13.setBackgroundColor(resources.getColor(R.color.red, null))
                button23.setBackgroundColor(resources.getColor(R.color.red, null))
                button33.setBackgroundColor(resources.getColor(R.color.red, null))
                button11.isEnabled=false
                button12.isEnabled=false
                button21.isEnabled=false
                button22.isEnabled=false
                button31.isEnabled=false
                button32.isEnabled=false
                txtvictory.isVisible=true
                txtwhoiswin.isVisible=true
                android.os.Handler().postDelayed({ builder.show()}, 2000)
            }
            if (button13.text != "" && button13.text == button23.text && button13.text == button33.text)
            {
                button13.setBackgroundColor(resources.getColor(R.color.red, null))
                button23.setBackgroundColor(resources.getColor(R.color.red, null))
                button33.setBackgroundColor(resources.getColor(R.color.red, null))
                button11.isEnabled=false
                button12.isEnabled=false
                button21.isEnabled=false
                button22.isEnabled=false
                button31.isEnabled=false
                button32.isEnabled=false
                txtvictory.isVisible=true
                txtwhoiswin.isVisible=true
                android.os.Handler().postDelayed({ builder.show()}, 2000)
            }
            if(button21.text != "" && button21.text == button22.text && button21.text == button23.text)
            {
                button21.setBackgroundColor(resources.getColor(R.color.red, null))
                button22.setBackgroundColor(resources.getColor(R.color.red, null))
                button23.setBackgroundColor(resources.getColor(R.color.red, null))
                button11.isEnabled=false
                button12.isEnabled=false
                button13.isEnabled=false
                button31.isEnabled=false
                button32.isEnabled=false
                button33.isEnabled=false
                txtvictory.isVisible=true
                txtwhoiswin.isVisible=true
                android.os.Handler().postDelayed({ builder.show()}, 2000)
            }
            if (button31.text != "" && button31.text == button22.text && button31.text == button13.text)
            {
                button31.setBackgroundColor(resources.getColor(R.color.red, null))
                button22.setBackgroundColor(resources.getColor(R.color.red, null))
                button13.setBackgroundColor(resources.getColor(R.color.red, null))
                button11.isEnabled=false
                button12.isEnabled=false
                button21.isEnabled=false
                button23.isEnabled=false
                button32.isEnabled=false
                button33.isEnabled=false
                txtvictory.isVisible=true
                txtwhoiswin.isVisible=true
                android.os.Handler().postDelayed({ builder.show()}, 2000)
            }
            if(button31.text != "" && button31.text == button32.text && button31.text == button33.text)
            {
                button31.setBackgroundColor(resources.getColor(R.color.red, null))
                button32.setBackgroundColor(resources.getColor(R.color.red, null))
                button33.setBackgroundColor(resources.getColor(R.color.red, null))
                button11.isEnabled=false
                button12.isEnabled=false
                button13.isEnabled=false
                button21.isEnabled=false
                button22.isEnabled=false
                button23.isEnabled=false
                txtvictory.isVisible=true
                txtwhoiswin.isVisible=true
                android.os.Handler().postDelayed({ builder.show()}, 2000)
            }
            if (button11.text != "" && button12.text != "" && button13.text != "" && button21.text != "" && button22.text != "" && button23.text != "" && button31.text != "" && button32.text != "" && button33.text != "") {
                txtvictory.text = "НИЧЬЯ!"
                txtvictory.textAlignment = View.TEXT_ALIGNMENT_TEXT_END
                txtvictory.isVisible=true
                button11.isEnabled=false
                button12.isEnabled=false
                button13.isEnabled=false
                button21.isEnabled=false
                button22.isEnabled=false
                button23.isEnabled=false
                button31.isEnabled=false
                button32.isEnabled=false
                button33.isEnabled=false
                android.os.Handler().postDelayed({ builder.show()}, 1111)
            }
            else {
            }

        }

        button11.text = ""
        button12.text = ""
        button13.text = ""
        button21.text = ""
        button22.text = ""
        button23.text = ""
        button31.text = ""
        button32.text = ""
        button33.text = ""

        button11.setOnClickListener {
            if (stateCross == true && button11.text.isEmpty()) {
                button11.text = "X"
                button11.setBackgroundColor(resources.getColor(R.color.pinkcream, null))
                button11.setTextColor(resources.getColor(R.color.black,null))
                stateCross = false
                stateZero = true
                checkWin(gamerCross)
                colourWin()
            }
            if (stateCross == false && button11.text.isEmpty()) {
                button11.text = "O"
                button11.setBackgroundColor(resources.getColor(R.color.bluesky, null))
                button11.setTextColor(resources.getColor(R.color.black,null))
                stateCross = true
                stateZero = false
                checkWin(gamerZero)
                colourWin()
            } else {
            }
        }
        button12.setOnClickListener {
            when {
                stateCross == true && button12.text.isEmpty() -> {
                    button12.text = "X"
                    button12.setBackgroundColor(resources.getColor(R.color.pinkcream, null))
                    button12.setTextColor(resources.getColor(R.color.black,null))
                    stateCross = false
                    stateZero = true
                    checkWin(gamerCross)
                    colourWin()
                }
                stateCross == false && button12.text.isEmpty() -> {
                    button12.text = "O"
                    button12.setBackgroundColor(resources.getColor(R.color.bluesky, null))
                    button12.setTextColor(resources.getColor(R.color.black,null))
                    stateCross = true
                    stateZero = false
                    checkWin(gamerZero)
                    colourWin()
                }
                else -> {}
            }
        }
        button13.setOnClickListener {
            when {
                stateCross == true && button13.text.isEmpty() -> {
                    button13.text = "X"
                    button13.setBackgroundColor(resources.getColor(R.color.pinkcream, null))
                    button13.setTextColor(resources.getColor(R.color.black,null))
                    stateCross = false
                    stateZero = true
                    checkWin(gamerCross)
                    colourWin()
                }
                stateCross == false && button13.text.isEmpty() -> {
                    button13.text = "O"
                    button13.setBackgroundColor(resources.getColor(R.color.bluesky, null))
                    button13.setTextColor(resources.getColor(R.color.black,null))
                    stateCross = true
                    stateZero = false
                    checkWin(gamerZero)
                    colourWin()
                }
                else -> {}
            }
        }
        button21.setOnClickListener {
            when {
                stateCross == true && button21.text.isEmpty() -> {
                    button21.text = "X"
                    button21.setBackgroundColor(resources.getColor(R.color.pinkcream, null))
                    button21.setTextColor(resources.getColor(R.color.black,null))
                    stateCross = false
                    stateZero = true
                    checkWin(gamerCross)
                    colourWin()
                }
                stateCross == false && button21.text.isEmpty() -> {
                    button21.text = "O"
                    button21.setBackgroundColor(resources.getColor(R.color.bluesky, null))
                    button21.setTextColor(resources.getColor(R.color.black,null))
                    stateCross = true
                    stateZero = false
                    checkWin(gamerZero)
                    colourWin()
                }
                else -> {
                }
            }
        }
        button22.setOnClickListener {
            when {
                stateCross == true && button22.text.isEmpty() -> {
                    button22.text = "X"
                    button22.setBackgroundColor(resources.getColor(R.color.pinkcream, null))
                    button22.setTextColor(resources.getColor(R.color.black,null))
                    stateCross = false
                    stateZero = true
                    checkWin(gamerCross)
                    colourWin()
                }
                stateCross == false && button22.text.isEmpty() -> {
                    button22.text = "O"
                    button22.setBackgroundColor(resources.getColor(R.color.bluesky, null))
                    button22.setTextColor(resources.getColor(R.color.black,null))
                    stateCross = true
                    stateZero = false
                    checkWin(gamerZero)
                    colourWin()
                }
                else -> {}
            }
        }
        button23.setOnClickListener {
            when {
                stateCross == true && button23.text.isEmpty() -> {
                    button23.text = "X"
                    button23.setBackgroundColor(resources.getColor(R.color.pinkcream, null))
                    button23.setTextColor(resources.getColor(R.color.black,null))
                    stateCross = false
                    stateZero = true
                    checkWin(gamerCross)
                    colourWin()
                }
                stateCross == false && button23.text.isEmpty() -> {
                    button23.text = "O"
                    button23.setBackgroundColor(resources.getColor(R.color.bluesky, null))
                    button23.setTextColor(resources.getColor(R.color.black,null))
                    stateCross = true
                    stateZero = false
                    checkWin(gamerZero)
                    colourWin()
                }
                else -> {}
            }
        }

        button31.setOnClickListener {
            when {
                stateCross == true && button31.text.isEmpty() -> {
                    button31.text = "X"
                    button31.setBackgroundColor(resources.getColor(R.color.pinkcream, null))
                    button31.setTextColor(resources.getColor(R.color.black,null))
                    stateCross = false
                    stateZero = true
                    checkWin(gamerCross)
                    colourWin()
                }
                stateCross == false && button31.text.isEmpty() -> {
                    button31.text = "O"
                    button31.setBackgroundColor(resources.getColor(R.color.bluesky, null))
                    button31.setTextColor(resources.getColor(R.color.black,null))
                    stateCross = true
                    stateZero = false
                    checkWin(gamerZero)
                    colourWin()
                }
                else -> {}
            }
        }
        button32.setOnClickListener {
            if (stateCross == true &&  button32.text.isEmpty()) {
                button32.text = "X"
                button32.setBackgroundColor(resources.getColor(R.color.pinkcream, null))
                button32.setTextColor(resources.getColor(R.color.black,null))
                stateCross = false
                stateZero = true
                checkWin(gamerCross)
                colourWin()
            }
            if (stateCross == false &&  button32.text.isEmpty()){
                button32.text = "O"
                button32.setBackgroundColor(resources.getColor(R.color.bluesky, null))
                button32.setTextColor(resources.getColor(R.color.black,null))
                stateCross = true
                stateZero = false
                checkWin(gamerZero)
                colourWin()
            }
            else{}
        }
        button33.setOnClickListener {
            if (stateCross == true &&  button33.text.isEmpty()) {
                button33.text = "X"
                button33.setBackgroundColor(resources.getColor(R.color.pinkcream, null))
                button33.setTextColor(resources.getColor(R.color.black,null))
                stateCross = false
                stateZero = true
                checkWin(gamerCross)
                colourWin()
            }
            if (stateCross == false &&  button33.text.isEmpty()) {
                button33.text = "O"
                stateCross = true
                stateZero = false
                button33.setBackgroundColor(resources.getColor(R.color.bluesky, null))
                button33.setTextColor(resources.getColor(R.color.black,null))
                checkWin(gamerZero)
                colourWin()
            }
            else {
            }
        }

        restartgame.setOnClickListener {
            finish()
            startActivity(restart)
        }

    }
}
