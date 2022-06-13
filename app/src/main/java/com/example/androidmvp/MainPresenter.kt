package com.example.androidmvp

class MainPresenter(private val mainView: MainView) {
    fun hitungLuasPersegiPjg(panjang: Float, lebar: Float){
        if (panjang == 0F){
            mainView.showError("Panjang tidak boleh 0")
            return
        }
        if(lebar == 0F){
            mainView.showError("Lebar tidak boleh 0")
            return
        }

        val luas = panjang * lebar
        mainView.LuasPersegiPjg(luas)
    }

    fun hitungKelilingPersegiPjg(panjang: Float, lebar: Float){
        if (panjang == 0F){
            mainView.showError("Panjang tidak boleh 0")
            return
        }
        if(lebar == 0F){
            mainView.showError("Lebar tidak boleh 0")
            return
        }

        val keliling = 2*(panjang + lebar)
        mainView.KelilingPersegiPjg(keliling)
    }

    fun hitungLuasPersegi(sisi: Float){
        if (sisi == 0F){
            mainView.showError("Sisi tidak boleh 0")
            return
        }

        val luas = sisi * sisi
        mainView.LuasPersegi(luas)
    }

    fun hitungKelilingPersegi(sisi: Float){
        if (sisi == 0F){
            mainView.showError("Sisi tidak boleh 0")
            return
        }

        val keliling = 4 * sisi
        mainView.KelilingPersegi(keliling)
    }
}