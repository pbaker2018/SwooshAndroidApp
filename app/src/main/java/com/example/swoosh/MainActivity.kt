package com.example.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getStartedBtn.setOnClickListener {
            val leagueIntent = Intent(this, LeagueActivity::class.java)
            startActivity(leagueIntent)
            /*the above is an example of explicit intent*/
            /*it is explicit because we specify the target class*/
            /*'this' is referring to the context of the activity we are in*/
        }
    }
}
