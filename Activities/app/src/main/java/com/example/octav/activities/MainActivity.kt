package com.example.octav.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    //val materias = arrayOf("Opción","Ingenieria en computacion", "Ingenieria Petrolera")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById(R.id.textView13) as Button
        val btn2 = findViewById(R.id.textView14) as Button

        btn.setOnClickListener{
            val intent = Intent(this@MainActivity, Linear::class.java)
            startActivity(intent)
        }

        btn2.setOnClickListener{
            val intent = Intent(this@MainActivity, Relative::class.java)
            startActivity(intent)
        }

        /*var spin : Spinner = findViewById(R.id.spinner2) as Spinner
        val adapter = ArrayAdapter (this,android.R.layout.simple_list_item_1, materias)
        spin.adapter = adapter*/
    }
}
