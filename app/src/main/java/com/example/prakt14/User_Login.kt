package com.example.prakt14

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class User_Login : AppCompatActivity() {
    lateinit var user_name : EditText
    lateinit var  email : EditText
    lateinit var password : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.user_login)

        setContentView(R.layout.user_login)
     user_name = findViewById(R.id.user_login)
        email = findViewById(R.id.Email_Adress)
        password = findViewById(R.id.password_toggle)
    }
    fun backbutton(view: View)
    {
        val alert = AlertDialog.Builder(this)
            .setTitle("Ошибка")
            .setMessage("Вы еще не зарегистрировались")
            .setPositiveButton("Ok",null)
            .create()
            .show()
    }
    fun registration(view: View)
    {
        if(user_name.text.toString().isNotEmpty() && email.text.toString().isNotEmpty() && password.text.toString().isNotEmpty())
        {
            val intent = Intent(this,SettingsActivity::class.java)
            startActivity(intent)
        }
        else
        {
            val alert = AlertDialog.Builder(this)
                .setTitle("Ошибка")
                .setMessage("У вас есть незаполненные поля")
                .setPositiveButton("Ok",null)
                .create()
                .show()
        }
    }
}