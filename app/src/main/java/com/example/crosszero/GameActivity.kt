package com.example.crosszero

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_game.*


class GameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        fun checkWin () {
            when {
                button11.text == button12.text && button11.text == button13.text -> txtvictory.isVisible
                button11.text == button21.text && button11.text == button31.text -> txtvictory.isVisible
                button11.text == button22.text && button11.text == button33.text -> txtvictory.isVisible

                button12.text == button22.text && button12.text == button32.text -> txtvictory.isVisible
                button12.text == button11.text && button12.text == button13.text -> txtvictory.isVisible

                button13.text == button23.text && button13.text == button33.text -> txtvictory.isVisible
                button13.text == button12.text && button13.text == button11.text -> txtvictory.isVisible
                button13.text == button22.text && button13.text == button31.text -> txtvictory.isVisible

                button21.text == button22.text && button21.text == button23.text -> txtvictory.isVisible
                button21.text == button11.text && button21.text == button31.text -> txtvictory.isVisible

                button22.text == button21.text && button22.text == button23.text -> txtvictory.isVisible
                button22.text == button11.text && button12.text == button33.text -> txtvictory.isVisible
                button22.text == button12.text && button22.text == button32.text -> txtvictory.isVisible

                button23.text == button13.text && button23.text == button33.text -> txtvictory.isVisible
                button23.text == button22.text && button23.text == button21.text -> txtvictory.isVisible

                button31.text == button21.text && button31.text == button11.text -> txtvictory.isVisible
                button31.text == button22.text && button31.text == button13.text -> txtvictory.isVisible
                button31.text == button32.text && button31.text == button33.text -> txtvictory.isVisible

                button32.text == button22.text && button32.text == button12.text -> txtvictory.isVisible
                button32.text == button31.text && button32.text == button33.text -> txtvictory.isVisible

                button33.text == button22.text && button33.text == button11.text -> txtvictory.isVisible
                button33.text == button32.text && button33.text == button31.text -> txtvictory.isVisible
                button33.text == button23.text && button33.text == button13.text -> txtvictory.isVisible
            else -> {
                txtvictory.isVisible
                txtvictory.text ="Еще никто не выиграл"
            }
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

        var stateZero = intent.getBooleanExtra("zerotrue", false)
        var stateCross = intent.getBooleanExtra("crosstrue", false)


        checkwinz.setOnClickListener {
            checkWin()
        }
        button11.setOnClickListener {
            if (stateCross == true && button11.text.isEmpty()) {
                button11.text = "X"
                stateCross = false
                stateZero = true
                checkWin()
            }
            if (stateCross == false && button11.text.isEmpty()) {
                button11.text = "O"
                stateCross = true
                stateZero = false
                checkWin()
            } else {
            }
        }
        button12.setOnClickListener {
            when {
                stateCross == true && button12.text.isEmpty() -> {
                    button12.text = "X"
                    stateCross = false
                    stateZero = true
                    checkWin()
                }
                stateCross == false && button12.text.isEmpty() -> {
                    button12.text = "O"
                    stateCross = true
                    stateZero = false
                    checkWin()
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
                    checkWin()
                }
                stateCross == false && button13.text.isEmpty() -> {
                    button13.text = "O"
                    stateCross = true
                    stateZero = false
                    checkWin()
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
                    checkWin()
                }
                stateCross == false && button21.text.isEmpty() -> {
                    button21.text = "O"
                    stateCross = true
                    stateZero = false
                    checkWin()
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
                    checkWin()
                }
                stateCross == false && button22.text.isEmpty() -> {
                    button22.text = "O"
                    stateCross = true
                    stateZero = false
                    checkWin()
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
                    checkWin()
                }
                stateCross == false && button23.text.isEmpty() -> {
                    button23.text = "O"
                    stateCross = true
                    stateZero = false
                    checkWin()
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
                    checkWin()
                }
                stateCross == false && button31.text.isEmpty() -> {
                    button31.text = "O"
                    stateCross = true
                    stateZero = false
                    checkWin()
                }
                else -> {}
            }
        }

        button32.setOnClickListener {
            if (stateCross == true &&  button32.text.isEmpty()) {
                button32.text = "X"
                stateCross = false
                stateZero = true
                checkWin()
            }
            if (stateCross == false &&  button32.text.isEmpty()){
                button32.text = "O"
                stateCross = true
                stateZero = false
                checkWin()
            }
            else{}
        }
        button33.setOnClickListener {
            if (stateCross == true &&  button33.text.isEmpty()) {
                button33.text = "X"
                stateCross = false
                stateZero = true
                checkWin()
            }
            if (stateCross == false &&  button33.text.isEmpty()) {
                button33.text = "O"
                stateCross = true
                stateZero = false
                checkWin()
            }
            else {
            }
        }

    }
}
