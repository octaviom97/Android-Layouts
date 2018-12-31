package com.example.octav.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_ingresar_datos.view.*

class ingresar_datos : AppCompatActivity() {

    val materias = arrayOf("Ingenieria en computacion", "Ingenieria Petrolera")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ingresar_datos)

        var spin : Spinner = findViewById(R.id.spinner2) as Spinner
        val adapter = ArrayAdapter (this,android.R.layout.simple_list_item_1, materias)
        spin.adapter = adapter

    }
}
