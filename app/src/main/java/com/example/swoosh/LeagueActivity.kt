package com.example.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LeagueActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun nextClicked(view: View) {
        val leagueIntent = Intent(this, LevelActivity::class.java)
        startActivity(leagueIntent)
    }

    /*the function nextClicked takes place outside of onCreate because I used the onclick section of the buttons attributes.*/
}
