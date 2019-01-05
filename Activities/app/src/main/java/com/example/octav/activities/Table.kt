package com.example.octav.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Table : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_table)

        val btn = findViewById(R.id.btn4) as Button

        btn.setOnClickListener{
            finish()
        }
    }
}
