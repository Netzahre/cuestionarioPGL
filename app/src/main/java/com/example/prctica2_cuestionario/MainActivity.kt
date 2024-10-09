package com.example.prctica2_cuestionario

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val respuestasCorrectasUnica = arrayOf("Sam Porter Bridges", "Detectar entidades sobrenaturales",
            "América", "Higgs Monaghan","Tiendas privadas", "Conexiones y aislamiento",
            "Acelera el deterioro y envejecimiento", "Reconectar a América")

        val respuestasCorrectasMultiopcion = arrayOf(arrayOf("BTs", "EV"),
            arrayOf("Facilitar la conexión entre jugadores en línea", "Permitir teletransportarse"),
            arrayOf()
        )

        val pregunta1 = arrayOf("Detectar entidades sobrenaturales",
            "Servir como una fuente de energía", "Sanar heridas", "Brindar información sobre el pasado")
        val adaptador1 = ArrayAdapter<String>(this, R.layout.my_menu_dropdown,
            pregunta1)
        val spinner1 = findViewById<Spinner>(R.id.respuestaspinpreg2)
        spinner1.adapter = adaptador1

        val pregunta4 = arrayOf("Heartman", "Fragile", "Higgs Monaghan", "Amelie")
        val adaptador2 = ArrayAdapter<String>(this, R.layout.my_menu_dropdown, pregunta4)
        val spinner2 = findViewById<Spinner>(R.id.respuestaspinpreg4)
        spinner2.adapter = adaptador2

        val pregunta6 = arrayOf("Moto triciclo", "Tiendas privadas", "Exoesqueleto", "Camiones")
        val adaptador3 = ArrayAdapter<String>(this, R.layout.my_menu_dropdown, pregunta6)
        val spinner3 = findViewById<Spinner>(R.id.respuestaspinpreg6)
        spinner3.adapter = adaptador3

        val pregunta10 = arrayOf("Reconectar a América", "Destruir a los BTs", "Derrotar a Higgs", "Salvar a Amelie")
        val adaptador4 = ArrayAdapter<String>(this, R.layout.my_menu_dropdown, pregunta10)
        val spinner4 = findViewById<Spinner>(R.id.respuestaspinpreg10)
        spinner4.adapter = adaptador4

        val respuestaRadio1Preg1 = findViewById<RadioButton>(R.id.respuestarad1preg1)
        val respuestaRadio2Preg1 = findViewById<RadioButton>(R.id.respuestarad2preg1)
        val respuestaRadio3Preg1 = findViewById<RadioButton>(R.id.respuestarad3preg1)
        val respuestaRadio4Preg1 = findViewById<RadioButton>(R.id.respuestarad4preg1)

        val respuestaRadio1Preg3 = findViewById<RadioButton>(R.id.respuestarad1preg3)
        val respuestaRadio2Preg3 = findViewById<RadioButton>(R.id.respuestarad2preg3)
        val respuestaRadio3Preg3 = findViewById<RadioButton>(R.id.respuestarad3preg3)
        val respuestaRadio4Preg3 = findViewById<RadioButton>(R.id.respuestarad4preg3)

        val respuestaRadio1Preg7 = findViewById<RadioButton>(R.id.respuestarad1preg7)
        val respuestaRadio2Preg7 = findViewById<RadioButton>(R.id.respuestarad2preg7)
        val respuestaRadio3Preg7 = findViewById<RadioButton>(R.id.respuestarad3preg7)
        val respuestaRadio4Preg7 = findViewById<RadioButton>(R.id.respuestarad4preg7)

        val respuestaRadio1Preg8 = findViewById<RadioButton>(R.id.respuestarad1preg8)
        val respuestaRadio2Preg8 = findViewById<RadioButton>(R.id.respuestarad2preg8)
        val respuestaRadio3Preg8 = findViewById<RadioButton>(R.id.respuestarad3preg8)
        val respuestaRadio4Preg8 = findViewById<RadioButton>(R.id.respuestarad4preg8)

        val check1preg5 = findViewById<CheckBox>(R.id.check1Preg5)
        val check2preg5 = findViewById<CheckBox>(R.id.check2Preg5)
        val check3preg5 = findViewById<CheckBox>(R.id.check3Preg5)
        val check4preg5 = findViewById<CheckBox>(R.id.check4Preg5)

        val check1preg9 = findViewById<CheckBox>(R.id.check1Preg9)
        val check2preg9 = findViewById<CheckBox>(R.id.check2Preg9)
        val check3preg9 = findViewById<CheckBox>(R.id.check3Preg9)
        val check4preg9 = findViewById<CheckBox>(R.id.check4Preg9)

        val corregir = findViewById<Button>(R.id.corregir)

        val resultado1 = findViewById<TextView>(R.id.resultado1)
        val resultado2 = findViewById<TextView>(R.id.resultado2)
        val resultado3 = findViewById<TextView>(R.id.resultado3)
        val resultado4 = findViewById<TextView>(R.id.resultado4)
        val resultado5 = findViewById<TextView>(R.id.resultado5)
        val resultado6 = findViewById<TextView>(R.id.resultado6)
        val resultado7 = findViewById<TextView>(R.id.resultado7)
        val resultado8 = findViewById<TextView>(R.id.resultado8)
        val resultado9 = findViewById<TextView>(R.id.resultado9)
        val resultado10 = findViewById<TextView>(R.id.resultado10)

        val resultadoTotal = findViewById<TextView>(R.id.numero)


    }
}