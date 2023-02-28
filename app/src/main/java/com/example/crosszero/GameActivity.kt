package com.example.crosszero

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_game.*


class GameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        button11.text = ""
        button12.text = ""
        button13.text = ""
        button21.text = ""
        button22.text = ""
        button23.text = ""
        button31.text = ""
        button32.text = ""
        button33.text = ""
        val gamerZero = "ZERO"
        val gamerCross = "CROSS"
        var stateZero = intent.getBooleanExtra("zerotrue", false)
        var stateCross = intent.getBooleanExtra("crosstrue", false)
        var restart = Intent (this, MainActivity::class.java)
        val builder = AlertDialog.Builder(this)
        builder
            .setTitle(R.string.dialog_tittle_message)
            .setMessage(R.string.dialog_about_message)
            .setIcon(android.R.drawable.ic_dialog_info)
            .setPositiveButton("Да", DialogInterface.OnClickListener { dialog, which ->
                startActivity(restart)
            })
            .setNegativeButton("Нет", DialogInterface.OnClickListener { dialog, which ->
                finishAffinity()
            })
            .create()

                fun checkWin (kto: String) {
            when {
                button11.text!=""&&button11.text == button12.text && button11.text == button13.text -> txtvictory.text = txtvictory.text.toString().plus(" $kto")

                button11.text!=""&&button11.text == button21.text && button11.text == button31.text -> txtvictory.text = txtvictory.text.toString().plus(" $kto")
                button11.text!=""&&button11.text == button22.text && button11.text == button33.text -> txtvictory.text = txtvictory.text.toString().plus(" $kto")

                button12.text!=""&&button12.text == button22.text && button12.text == button32.text -> txtvictory.text = txtvictory.text.toString().plus(" $kto")

                button13.text!=""&&button13.text == button23.text && button13.text == button33.text -> txtvictory.text = txtvictory.text.toString().plus(" $kto")

                button21.text!=""&& button21.text == button22.text && button21.text == button23.text -> txtvictory.text = txtvictory.text.toString().plus(" $kto")
                button31.text!=""&&button31.text == button22.text && button31.text == button13.text -> txtvictory.text = txtvictory.text.toString().plus(" $kto")
                button31.text!=""&&button31.text == button32.text && button31.text == button33.text -> txtvictory.text = txtvictory.text.toString().plus(" $kto")
                button11.text!=""&&button12.text!=""&&button13.text!=""&& button21.text!=""&&button22.text!=""&&button23.text!=""&&button31.text!=""&&button32.text!=""&&button33.text!="" ->
                    txtvictory.text = "НИЧЬЯ"
            }
            if (txtvictory.text=="НИЧЬЯ")
                builder.show()
            else {}
            }

        button11.setOnClickListener {
            if (stateCross == true && button11.text.isEmpty()) {
                button11.text = "X"
                stateCross = false
                stateZero = true
                checkWin(gamerCross)
            }
            if (stateCross == false && button11.text.isEmpty()) {
                button11.text = "O"
                stateCross = true
                stateZero = false
                checkWin(gamerZero)
            } else {
            }
        }
        button12.setOnClickListener {
            when {
                stateCross == true && button12.text.isEmpty() -> {
                    button12.text = "X"
                    stateCross = false
                    stateZero = true
                    checkWin(gamerCross)
                }
                stateCross == false && button12.text.isEmpty() -> {
                    button12.text = "O"
                    stateCross = true
                    stateZero = false
                    checkWin(gamerZero)
                }
                else -> {}
            }
        }
        button13.setOnClickListener {
            when {
                stateCross == true && button13.text.isEmpty() -> {
                    button13.text = "X"
                    stateCross = false
                    stateZero = true
                    checkWin(gamerCross)
                }
                stateCross == false && button13.text.isEmpty() -> {
                    button13.text = "O"
                    stateCross = true
                    stateZero = false
                    checkWin(gamerZero)
                }
                else -> {}
            }
        }
        button21.setOnClickListener {
            when {
                stateCross == true && button21.text.isEmpty() -> {
                    button21.text = "X"
                    stateCross = false
                    stateZero = true
                    checkWin(gamerCross)
                }
                stateCross == false && button21.text.isEmpty() -> {
                    button21.text = "O"
                    stateCross = true
                    stateZero = false
                    checkWin(gamerZero)
                }
                else -> {
                }
            }
        }
        button22.setOnClickListener {
            when {
                stateCross == true && button22.text.isEmpty() -> {
                    button22.text = "X"
                    stateCross = false
                    stateZero = true
                    checkWin(gamerCross)
                }
                stateCross == false && button22.text.isEmpty() -> {
                    button22.text = "O"
                    stateCross = true
                    stateZero = false
                    checkWin(gamerZero)
                }
                else -> {}
            }
        }
        button23.setOnClickListener {
            when {
                stateCross == true && button23.text.isEmpty() -> {
                    button23.text = "X"
                    stateCross = false
                    stateZero = true
                    checkWin(gamerCross)
                }
                stateCross == false && button23.text.isEmpty() -> {
                    button23.text = "O"
                    stateCross = true
                    stateZero = false
                    checkWin(gamerZero)
                }
                else -> {}
            }
        }
        button31.setOnClickListener {
            when {
                stateCross == true && button31.text.isEmpty() -> {
                    button31.text = "X"
                    stateCross = false
                    stateZero = true
                    checkWin(gamerCross)
                }
                stateCross == false && button31.text.isEmpty() -> {
                    button31.text = "O"
                    stateCross = true
                    stateZero = false
                    checkWin(gamerZero)
                }
                else -> {}
            }
        }
        button32.setOnClickListener {
            if (stateCross == true &&  button32.text.isEmpty()) {
                button32.text = "X"
                stateCross = false
                stateZero = true
                checkWin(gamerCross)
            }
            if (stateCross == false &&  button32.text.isEmpty()){
                button32.text = "O"
                stateCross = true
                stateZero = false
                checkWin(gamerZero)
            }
            else{}
        }
        button33.setOnClickListener {
            if (stateCross == true &&  button33.text.isEmpty()) {
                button33.text = "X"
                stateCross = false
                stateZero = true
                checkWin(gamerCross)
            }
            if (stateCross == false &&  button33.text.isEmpty()) {
                button33.text = "O"
                stateCross = true
                stateZero = false
                checkWin(gamerZero)
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
