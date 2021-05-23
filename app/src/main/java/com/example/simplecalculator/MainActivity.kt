package com.example.simplecalculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var etResult=findViewById<TextView>(R.id.tvResult)
        var etEnterNumber1=findViewById<EditText>(R.id.etEnterNumber1)
        var etEnterNumber2=findViewById<EditText>(R.id.etEnterNumber2)
        var btnAddition=findViewById<Button>(R.id.btnAddition)
        var btnSubstract=findViewById<Button>(R.id.btnSubstract)
        var btnMultiple=findViewById<Button>(R.id.btnMultiple)
        var btnModulus=findViewById<Button>(R.id.btnModulus)


        btnAddition.setOnClickListener{
           if(etEnterNumber1.text.toString().equals("")||etEnterNumber2.text.toString().equals("")){
               Toast.makeText(baseContext,"Enter Number",Toast.LENGTH_LONG).show()
                   }
               else{
            var num1=etEnterNumber1.text.toString().toInt()
            var num2=etEnterNumber2.text.toString().toInt()
            var add=num1+num2
            etResult.text="Result $add"
        }
        }
        btnSubstract.setOnClickListener {
            if (etEnterNumber1.text.toString().equals("") || etEnterNumber2.text.toString()
                    .equals("")
            ) {
                Toast.makeText(baseContext, "Enter Number", Toast.LENGTH_LONG).show()
            } else {
                var num1 = etEnterNumber1.text.toString().toInt()
                var num2 = etEnterNumber2.text.toString().toInt()
                var num3 = num1 - num2
                etResult.text = "Result $num3"
            }
        }
        btnMultiple.setOnClickListener {
            if (etEnterNumber1.text.toString().equals("") || etEnterNumber2.text.toString()
                    .equals("")
            ) {
                Toast.makeText(baseContext, "Enter Number", Toast.LENGTH_LONG).show()
            } else {
                var num1 = etEnterNumber1.text.toString().toInt()
                var num2 = etEnterNumber2.text.toString().toInt()
                var num3 = num1 * num2
                etResult.text = "Result $num3"
            }
        }
        btnModulus.setOnClickListener {
            if (etEnterNumber1.text.toString().equals("") || etEnterNumber2.text.toString()
                    .equals("")
            ) {
                Toast.makeText(baseContext, "Enter Number", Toast.LENGTH_LONG).show()
            } else {
                var num1 = etEnterNumber1.text.toString().toInt()
                var num2 = etEnterNumber2.text.toString().toInt()
                var num3 = num1 % num2
                etResult.text = "Result $num3"
            }
        }
    }




}