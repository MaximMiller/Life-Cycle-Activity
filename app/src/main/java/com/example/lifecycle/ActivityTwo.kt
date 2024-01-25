package com.example.lifecycle

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class ActivityTwo : AppCompatActivity() {
    val TAG = "lifeCycle"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "Activity Two create")
        setContentView(R.layout.avtivity_2)
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "Activity Two  становится видимым start")

    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "Activity Two  получает фокус resume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "Activity Two pause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Activity Two stop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "Activity Two destroy")
    }
}