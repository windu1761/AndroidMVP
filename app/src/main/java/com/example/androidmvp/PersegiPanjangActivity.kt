package com.example.androidmvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class PersegiPanjangActivity : AppCompatActivity(), MainView{
    private lateinit var etPanjang: EditText
    private lateinit var etLebar: EditText
    private lateinit var btnHitungLuas: Button
    private lateinit var btnHitungKeliling: Button
    private lateinit var tvHasil: TextView
    private lateinit var mainPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_persegi_panjang)

        mainPresenter = MainPresenter(this)
        etPanjang = findViewById(R.id.et_panjang)
        etLebar = findViewById(R.id.et_lebar)
        btnHitungKeliling = findViewById(R.id.btn_hitung_keliling)
        btnHitungLuas = findViewById(R.id.btn_hitung_luas)
        tvHasil = findViewById(R.id.tv_hasil)

        btnHitungLuas.setOnClickListener {
            val panjang = etPanjang.text.toString().toFloat()
            val lebar = etLebar.text.toString().toFloat()
            mainPresenter.hitungLuasPersegiPjg(panjang, lebar)
        }

        btnHitungKeliling.setOnClickListener {
            val panjang = etPanjang.text.toString().toFloat()
            val lebar = etLebar.text.toString().toFloat()
            mainPresenter.hitungKelilingPersegiPjg(panjang, lebar)
        }
    }

    override fun LuasPersegiPjg(luas : Float){
        tvHasil.text = luas.toString()
    }

    override fun KelilingPersegiPjg(keliling : Float){
        tvHasil.text = keliling.toString()
    }

    override fun LuasPersegi(luas: Float) {
        TODO("Not yet implemented")
    }

    override fun KelilingPersegi(keliling: Float) {
        TODO("Not yet implemented")
    }

    override fun showError(errorMsg : String){
        tvHasil.text = errorMsg
    }
}