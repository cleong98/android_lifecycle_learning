package com.example.activitylifecycletest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class NormalActivity : AppCompatActivity() {
    private val tag = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(tag, "normal activity onCreate")
        setContentView(R.layout.normal_layout)
    }

    override fun onStart() {
        super.onStart()
        Log.d(tag, "normal activity onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(tag, "normal activity onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(tag, "normal activity onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(tag, "normal activity onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(tag, "normal activity onDestory")
    }
}