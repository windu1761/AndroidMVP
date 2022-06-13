package com.example.androidmvp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AwalActivity : AppCompatActivity() {

    private lateinit var btnPersegi : Button
    private lateinit var btnPersegiPanjang : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_awal)

        btnPersegi = findViewById(R.id.btn_persegi)
        btnPersegiPanjang = findViewById(R.id.btn_persegipjg)

        btnPersegi.setOnClickListener {
            val intent = Intent (this, PersegiActivity::class.java)
            startActivity(intent)
        }

        btnPersegiPanjang.setOnClickListener {
            val intent = Intent (this, PersegiPanjangActivity::class.java)
            startActivity(intent)
        }
    }
}