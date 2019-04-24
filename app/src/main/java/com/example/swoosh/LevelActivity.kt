package com.example.swoosh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class LevelActivity : BaseActivity() {

    var league = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level)
        league = intent.getStringExtra(EXTRA_LEAGUE)
    }
    /*Here we are accessing the data from the previous page, via the Extra and the constant.
    a kotlin file was created to hold the constant that was created*/
}
