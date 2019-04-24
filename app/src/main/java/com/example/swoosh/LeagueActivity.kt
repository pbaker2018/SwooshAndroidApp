package com.example.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked(view: View) {
        womensToggleButton.isChecked = false
        mixedToggleButton.isChecked = false

        selectedLeague = "Mens"
    }

    fun onWomensClicked(view: View) {
        mensToggleButton.isChecked = false
        mixedToggleButton.isChecked = false

        selectedLeague = "Womens"
    }

    fun onMixedClicked(view: View) {
        womensToggleButton.isChecked = false
        mensToggleButton.isChecked = false

        selectedLeague = "Mixed"
    }
    /*the function onMixedClicked takes place outside of onCreate because I used the onclick section of the buttons attributes.*/


    fun nextClicked(view: View) {
        if (selectedLeague != "") {
            /*this means that if no league is selected, then you cant click on next*/
            val leagueIntent = Intent(this, LevelActivity::class.java)
            leagueIntent.putExtra(EXTRA_LEAGUE, selectedLeague)
            /*the 'extra' and the constant 'EXTRA_LEAGUE' allow you to persist data between pages*/
            startActivity(leagueIntent)
        } else {
            Toast.makeText(this, "Please select a league.", Toast.LENGTH_SHORT).show()
            /*the toast is a message/warning to the user*/
        }
        /*the function nextClicked takes place outside of onCreate because I used the onclick section of the buttons attributes.*/
    }
}
