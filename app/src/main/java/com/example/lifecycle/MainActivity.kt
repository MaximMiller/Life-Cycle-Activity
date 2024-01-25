package com.example.lifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {

    val TAG = "lifeCycle"
    private lateinit var button : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         Log.d(TAG, "Activity Main create")
        button = findViewById(R.id.btn_click)
        button.setOnClickListener {
            val intent = Intent(this, ActivityTwo::class.java)
            startActivity(intent)
        }


    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "Activity Main  становится видимым start")

    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "Activity Main  получает фокус resume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "Activity Main pause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Activity Main stop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "Activity Main destroy")
    }


}