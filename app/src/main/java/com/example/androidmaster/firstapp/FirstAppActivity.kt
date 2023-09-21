package com.example.androidmaster.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.example.androidmaster.R

class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app)
        //Al arrancar la pantalla

        val btnStart = findViewById<AppCompatButton>(R.id.btnStart)
        val etName = findViewById<AppCompatEditText>(R.id.etName)

        btnStart.setOnClickListener{
            val name = etName.text.toString()
            if(name.isNotEmpty()){
                //Log.i("Osmin", "Button Pulsado ${etName.text.toString()}")
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("Extra_Name", name)
                startActivity(intent)
            }
        }

    }
}