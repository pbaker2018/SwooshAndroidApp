package com.example.swoosh.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

/*This file is being created to log the method of each of the lifecycles when it occurs so we can see, in real time,
the order in which it is called and how it relates to the current activities we have.*/
/*We will log a message for EACH of the lifecycle methods*/
/*'Log' is an API for sending log output*/
/*when the MainActivity is launched, the Logcat will log the message "MainActivity onCreate"*/

open class BaseActivity : AppCompatActivity() {

    val TAG = "LifeCycle"

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "${javaClass.simpleName} onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        Log.d(TAG, "${javaClass.simpleName} onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d(TAG, "${javaClass.simpleName} onResume")
        super.onResume()
    }

    override fun onRestart() {
        Log.d(TAG, "${javaClass.simpleName} onRestart")
        super.onRestart()
    }

    override fun onPause() {
        Log.d(TAG, "${javaClass.simpleName} onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG, "${javaClass.simpleName} onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(TAG, "${javaClass.simpleName} onDestroy")
        super.onDestroy()
    }
}
