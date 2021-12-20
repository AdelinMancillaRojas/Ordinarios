package com.itiudc.ordi_adelina.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.itiudc.ordi_adelina.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val Email = findViewById<EditText>(R.id.login_email)
        val Password = findViewById<EditText>(R.id.login_password)
        val Button = findViewById<Button>(R.id.login_button)

        Button.setOnClickListener() {
            if (Email.text.isEmpty() || Password.text.isEmpty()) {
                Toast.makeText(this, "Fill in all the fields", Toast.LENGTH_SHORT).show()
            } else if(Email.text.contains("@")){
                var MainScreen: Intent = Intent(applicationContext, MainScreen::class.java)
                startActivity(MainScreen)
            }else{
                Toast.makeText(this, "Please write a correct email", Toast.LENGTH_SHORT).show()
            }
        }
    }
}