package com.example.anoopm.simplecalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    enum class Operations {
        ADD, SUBTRACT, MULTIPLY, DIVIDE
    }
    var currentOperation:Operations? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun initialize(){

        resultText.text = "0"
    }
    fun buttonClicked(view: View){

        when (view) {
            resultBtn ->{
                Toast.makeText(this,"RESULT PRESSED",Toast.LENGTH_SHORT).show()
            }
            sevenBtn ->{
                updateResultTextWith("7")
            }
            eightBtn ->{
                updateResultTextWith("8")
            }
            nineBtn ->{
                updateResultTextWith("9")
            }
            fourBtn ->{
                updateResultTextWith("4")
            }
            fiveBtn ->{
                updateResultTextWith("5")
            }
            sixBtn ->{
                updateResultTextWith("6")
            }
            oneBtn ->{
                updateResultTextWith("1")
            }
            twoBtn ->{
                updateResultTextWith("2")
            }
            threeBtn ->{
                updateResultTextWith("3")
            }
            zeroBtn ->{
                updateResultTextWith("0")
            }
            decimalBtn ->{
                updateResultTextWith(".")
            }
            addButton ->{
                currentOperation = Operations.ADD
            }
            divideBtn ->{
                currentOperation = Operations.DIVIDE
            }
            subtractBtn ->{
                currentOperation = Operations.SUBTRACT
            }
            multiplyBtn ->{
                currentOperation = Operations.MULTIPLY
            }

        }
        print(view.id)
    }

    fun updateResultTextWith(text: String){

        var currentString = resultText.text.toString()
        // If decimal is already there then dont add it again
        if (text == "."){

            if (currentString.contains(".")){
                return
            }
        }
        resultText.text = currentString + text
    }
    fun change (view: View){


        print(view.id)
    }
}
