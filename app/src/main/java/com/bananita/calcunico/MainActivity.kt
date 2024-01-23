package com.bananita.calcunico

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val cifra1: EditText = findViewById((R.id.num1))
        val cifra2: EditText = findViewById((R.id.num2))
        val resultado: Button = findViewById((R.id.igual))
        val resultado2: Button = findViewById((R.id.resta))
        val suma1: TextView = findViewById((R.id.suma1))

        resultado2.setOnClickListener {
            val num1 = cifra1.text.toString().toInt()
            val num2 = cifra2.text.toString().toInt()
            val restas = num1 - num2
            suma1.text = restas.toString()
        }

        resultado.setOnClickListener {
            val num1 = cifra1.text.toString().toInt()
            val num2 = cifra2.text.toString().toInt()
            val suma = num1 + num2
            suma1.text = suma.toString()
        }
    }
}



/*package com.bananita.calcunico

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cifra1: EditText = findViewById(R.id.num1)
        val cifra2: EditText = findViewById(R.id.num2)
        val resultado: Button = findViewById(R.id.igual)
        val botonSumar: Vie = findViewById(R.id.resultado)

        botonSumar.setOnClickListener {
            // Obtener valores de las cifras
            val valorCifra1 = cifra1.text.toString().toDoubleOrNull() ?: 0.0
            val valorCifra2 = cifra2.text.toString().toDoubleOrNull() ?: 0.0

            // Calcular la suma
            val resultadoSuma = valorCifra1 + valorCifra2

            // Mostrar el resultado en el campo 'resultado'
            resultado.setText(resultadoSuma.toString())
        }
    }
}*/
