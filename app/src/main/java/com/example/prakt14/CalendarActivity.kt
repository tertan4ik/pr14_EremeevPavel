package com.example.prakt14

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog

class CalendarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar)
    }
    fun but(view: View)
    {

        val alert = AlertDialog.Builder(this)
            .setTitle("Ошибка")
            .setMessage("Данная функция не доступнна")
            .setPositiveButton("Ok",null)
            .create()
            .show()
    }
    fun but1(view: View)
    {
        val intent = Intent(this,AlarmActivity::class.java)
        startActivity(intent)

    }
    fun but2(view: View)
    {
        val intent = Intent(this,CalendarActivity::class.java)
        startActivity(intent)
    }
    fun but3(view: View)
    {

        val intent = Intent(this,SettingsActivity::class.java)
        startActivity(intent)

    }

}