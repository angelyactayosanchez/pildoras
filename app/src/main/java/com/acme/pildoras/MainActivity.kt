 package com.acme.pildoras

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

 class MainActivity : AppCompatActivity() {

     private lateinit var txtRes : TextView
     private lateinit var btnIncre : Button
     private lateinit var btnDecre : Button
     private lateinit var btnReset : Button
     private lateinit var edtInit : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnDecre = findViewById(R.id.btnDecre)
        btnIncre = findViewById(R.id.btnIncre)
        btnReset = findViewById(R.id.btnReset)
        edtInit  = findViewById(R.id.edtRes)
        txtRes   = findViewById(R.id.txtRes)
    }
}