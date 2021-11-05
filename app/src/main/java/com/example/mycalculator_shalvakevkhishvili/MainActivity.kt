package com.example.mycalculator_shalvakevkhishvili

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var resultText: TextView

    private var num1: Double = 0.0
    private var operation: String = ""
    private var square: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultText = findViewById(R.id.resultText)
    }

    fun numberClick(clickedView: View) {
        if (clickedView is TextView) {

            var result = resultText.text.toString()
            val number = clickedView.text.toString()

            if (result == "0") {
                result = "0"
            }


            resultText.text = result + number

        }
    }



    fun operationClick(clickedView: View) {

        if (clickedView is TextView) {

            val result = resultText.text.toString()

            if (result.isNotEmpty()) {
                num1 = result.toDouble()
            }

            operation = clickedView.text.toString()

            resultText.text = ""

        }
    }


    fun squareClick(clickedView: View) {

        if (clickedView is TextView) {

            val result = resultText.text.toString()

            if (result.isNotEmpty()) {
                num1 = result.toDouble()
            }

            square = clickedView.text.toString()

            when(square){
                "y²" -> resultText.text = (num1 * num1).toString()

            }
        }



    }

    fun equalsClick(clickedView: View){

        val num2Text: String = resultText.text.toString()
        var num2: Double = 0.0

        if (num2Text.isNotEmpty()){
            num2 = num2Text.toDouble()
        }

        when(operation){
            "+" -> resultText.text = (num1 + num2).toString()
            "-" -> resultText.text = (num1 - num2).toString()
            "*" -> resultText.text = (num1 * num2).toString()
            "/" -> resultText.text = (num1 / num2).toString()


        }

    }



    fun clearClick(clickedView: View){
        if (clickedView is TextView){
            resultText.text = ""

        }

    }

}