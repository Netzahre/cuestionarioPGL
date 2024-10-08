package com.example.prctica2_cuestionario

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
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

        val pregunta1 = arrayOf("Detectar entidades sobrenaturales (Correcta)",
            "Servir como una fuente de energía", "Sanar heridas", "Brindar información sobre el pasado")
        val adaptador1 = ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,
            pregunta1)
        val spinner1 = findViewById<Spinner>(R.id.respuestaspinpreg2)
        spinner1.adapter = adaptador1

        val pregunta4 = arrayOf("Heartman", "Fragile", "Higgs Monaghan (Correcta)", "Amelie")
        val adaptador2 = ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, pregunta4)
        val spinner2 = findViewById<Spinner>(R.id.respuestaspinpreg4)
        spinner2.adapter = adaptador2

        val pregunta6 = arrayOf("Moto triciclo", "Tiendas privadas (Correcta)", "Exoesqueleto", "Camiones")
        val adaptador3 = ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, pregunta6)
        val spinner3 = findViewById<Spinner>(R.id.respuestaspinpreg6)
        spinner3.adapter = adaptador3

    }

}