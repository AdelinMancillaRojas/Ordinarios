package com.itiudc.ordi_adelina.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.itiudc.ordi_adelina.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Thread.sleep(3000)//Segundos en los que se muestra la splash screen para la splash screen

        setTheme(R.style.SplashTheme)//Llama el tema de la splashscreen

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var loginscreen: Intent = Intent(applicationContext, LoginActivity::class.java)
        startActivity(loginscreen)
    }
}