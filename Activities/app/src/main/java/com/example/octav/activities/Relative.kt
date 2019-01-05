package com.example.octav.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner

class Relative : AppCompatActivity() {

    var materias = arrayOf("Materias","Ingeniería en compu", "Informática","Ciencias en la compu")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relative)

        var spin : Spinner = findViewById(R.id.spin) as Spinner
        val adapter = ArrayAdapter (this,android.R.layout.simple_list_item_1, materias)
        spin.adapter = adapter

        val btn = findViewById(R.id.btn3) as Button
        btn.setOnClickListener{
            val intent = Intent(this@Relative, Table::class.java)
            startActivity(intent)
        }

        val btn2 = findViewById(R.id.btn5) as Button
        btn2.setOnClickListener{
            finish()
        }
    }
}
