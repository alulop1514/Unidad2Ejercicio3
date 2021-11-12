package com.example.unidad2_ejercicio3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.pow
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        b1.setOnClickListener {
            tv1.text = "${sqrt(2.0.pow(et1.text.toString().toDouble()) + 2.0.pow(et2.text.toString().toDouble()))}"
        }
    }
}