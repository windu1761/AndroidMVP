package com.example.androidmvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class PersegiActivity : AppCompatActivity(), MainView {
    private lateinit var etsisi: EditText
    private lateinit var btnHitungLuas: Button
    private lateinit var btnHitungKeliling: Button
    private lateinit var tvHasil: TextView
    private lateinit var mainPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_persegi)

        mainPresenter = MainPresenter(this)
        etsisi = findViewById(R.id.et_sisi)
        btnHitungKeliling = findViewById(R.id.btn_hitung_keliling)
        btnHitungLuas = findViewById(R.id.btn_hitung_luas)
        tvHasil = findViewById(R.id.tv_hasil)

        btnHitungLuas.setOnClickListener {
            val sisi = etsisi.text.toString().toFloat()
            mainPresenter.hitungLuasPersegi(sisi)
        }

        btnHitungKeliling.setOnClickListener {
            val sisi = etsisi.text.toString().toFloat()
            mainPresenter.hitungKelilingPersegi(sisi)
        }
    }

    override fun LuasPersegiPjg(luas: Float) {
        TODO("Not yet implemented")
    }

    override fun KelilingPersegiPjg(keliling: Float) {
        TODO("Not yet implemented")
    }

    override fun LuasPersegi(luas: Float) {
        tvHasil.text = luas.toString()
    }

    override fun KelilingPersegi(keliling: Float) {
        tvHasil.text = keliling.toString()
    }

    override fun showError(errorMsg: String) {
        tvHasil.text = errorMsg
    }
}
