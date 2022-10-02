package com.example.operacionesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val et1 = findViewById<EditText>(R.id.et1)
        val et2 = findViewById<EditText>(R.id.et2)
        val cb1 = findViewById<CheckBox>(R.id.cb1)
        val cb2 = findViewById<CheckBox>(R.id.cb2)
        val cb3 = findViewById<CheckBox>(R.id.cb3)
        val cb4 = findViewById<CheckBox>(R.id.cb4)
        val button = findViewById<Button>(R.id.button)
        val tv1 = findViewById<TextView>(R.id.tv1)

        button.setOnClickListener {
            var resultado = ""

            if (cb1.isChecked)
                resultado = "Suma = ${et1.text.toString().toInt() + et2.text.toString().toInt()}"

            if (cb2.isChecked)
                resultado = "Multiplicacion = ${et1.text.toString().toInt() * et2.text.toString().toInt()}"

            if (cb3.isChecked)
                resultado = "Resta = ${et1.text.toString().toInt() - et2.text.toString().toInt()}"

            if (cb4.isChecked)
                resultado = "Division = ${et1.text.toString().toInt() / et2.text.toString().toInt()}"

            tv1.text = resultado
        }
    }
}