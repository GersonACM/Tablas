package com.example.tablas

import com.example.tablas.Practica_activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.tablas.R

class MainActivity : AppCompatActivity() {
    lateinit var btnPracticar:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnPracticar = findViewById(R.id.btnPracticar)

        btnPracticar.setOnClickListener {
            val intentPracticar = Intent(this, Practica_activity::class.java)
            startActivity(intentPracticar)
        }
    }
}