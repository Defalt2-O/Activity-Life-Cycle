package com.example.activitylifecycle

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Thread.sleep(3000)
        installSplashScreen()
        setContentView(R.layout.activity_main)
        Log.d("Activity_Lifecycle","onCreate invoked");
    }

    override fun onStart() {
        super.onStart()
        setContentView(R.layout.activity_main)
        Log.d("Activity_Lifecycle","onStart invoked");
    }

    override fun onResume() {
        super.onResume()
        Log.d("Activity_Lifecycle","onResume invoked");
    }

    override fun onPause() {
        super.onPause()
        Log.d("Activity_Lifecycle","onPause invoked");
    }

    override fun onStop() {
        super.onStop()
        Log.d("Activity_Lifecycle","onStop invoked");
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Activity_Lifecycle","onRestart invoked");
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Activity_Lifecycle","onDestroy invoked");
    }
}