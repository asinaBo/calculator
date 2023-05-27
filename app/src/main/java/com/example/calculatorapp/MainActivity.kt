package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import net.objecthunter.exp4j.ExpressionBuilder
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //val edText : TextView = findViewById(R.id.edText)



    }


    var isNewOp = true
    var dot = false

    fun numberEvent (view: View)

    {
        if (isNewOp){
            val edText :TextView = findViewById(R.id.edText)
            edText.setText("")
        }
        isNewOp = false
        val edText :TextView = findViewById(R.id.edText)
        val buSelect = view as TextView
        var buClickValue: String = edText.text.toString()



        when (buSelect.id)
        {
            R.id.btn_0 ->
            {
                buClickValue+= "0"
            }
            R.id.btn_1->
            {
                buClickValue +="1"
            }
            R.id.btn_2->
            {
                buClickValue +="2"
            }
            R.id.btn_3->
            {
                buClickValue +="3"
            }
            R.id.btn_4->
            {
                buClickValue +="4"
            }
            R.id.btn_5->
            {
                buClickValue +="5"
            }
            R.id.btn_6->
            {
                buClickValue +="6"
            }
            R.id.btn_7->
            {
                buClickValue +="7"
            }
            R.id.btn_8->
            {
                buClickValue +="8"
            }
            R.id.btn_9->
            {
                buClickValue +="9"
            }
            R.id.btn_dot->
            {
                if (dot==false){
                    buClickValue += "."
                }
                dot=true
            }

        }
        edText.setText(buClickValue)
    }
var op = "X"
    var oldNumber = ""
    fun opEvent (view: View)
    {
        val buSelect=  view as TextView
        when (buSelect.id)
        {
            R.id.btn_multi->
            {
                op = "X"
            }
            R.id.btn_div->
            {
                op="÷"
            }
            R.id.btn_min->
            {
                op = "-"
            }
            R.id.btn_plus->
            {
                op = "+"
            }

        }
        val edText :TextView = findViewById(R.id.edText)
        oldNumber=edText.text.toString()
        isNewOp= true
        dot = false

    }

    fun equalEvent(view: View)
    {
        val edText :TextView = findViewById(R.id.edText)
        val newNumber = edText.text.toString()
        var finalNumber:Double?=null
        when(op)
        {
            "X"->
            {
                finalNumber = oldNumber.toDouble() * newNumber.toDouble()
            }
            "÷"->
            {
                finalNumber=oldNumber.toDouble() / newNumber.toDouble()
            }
            "-"->
            {
                finalNumber=oldNumber.toDouble() - newNumber.toDouble()
            }
            "+"->
            {
                finalNumber=oldNumber.toDouble() + newNumber.toDouble()
            }
        }
        edText.setText(finalNumber.toString())
        isNewOp=true
        }

    fun percentEvent(view: View)
    {
        val edText :TextView = findViewById(R.id.edText)
        val number=(edText.text.toString().toDouble())/100
        edText.setText(number.toString())
        isNewOp=true
    }

    fun cleanEvent(view: View)
    {
        val edText :TextView = findViewById(R.id.edText)
        edText.setText("")
        isNewOp=true
        dot=false
    }
    }

















