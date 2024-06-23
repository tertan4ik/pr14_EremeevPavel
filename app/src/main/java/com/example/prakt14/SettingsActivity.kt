package com.example.prakt14

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
    }

    fun calendar(view: View)
    {
            val intent = Intent(this,CalendarActivity::class.java)
            startActivity(intent)
    }
}