package com.example.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.utilities.EXTRA_LEAGUE
import com.example.swoosh.R
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

        selectedLeague = "Men's"
    }

    fun onWomensClicked(view: View) {
        mensToggleButton.isChecked = false
        mixedToggleButton.isChecked = false

        selectedLeague = "Women's"
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
