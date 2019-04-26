package com.example.swoosh.controller

import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.R
import com.example.swoosh.model.Player
import com.example.swoosh.utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var player = Player("", "")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked(view: View) {
        womensToggleButton.isChecked = false
        mixedToggleButton.isChecked = false

        player.league = "Men's"
    }

    fun onWomensClicked(view: View) {
        mensToggleButton.isChecked = false
        mixedToggleButton.isChecked = false

        player.league = "Women's"
    }

    fun onMixedClicked(view: View) {
        womensToggleButton.isChecked = false
        mensToggleButton.isChecked = false

        player.league = "Mixed"
    }
    /*the function onMixedClicked takes place outside of onCreate because I used the onclick section of the buttons attributes.*/

    fun nextClicked(view: View) {
        if (player.league != "") {
            /*this means that if no league is selected, then you cant click on next*/
            val leagueIntent = Intent(this, LevelActivity::class.java)
            leagueIntent.putExtra(EXTRA_PLAYER, player)
            /*the 'extra' and the constant 'EXTRA_LEAGUE' allow you to persist data between pages*/
            startActivity(leagueIntent)
        } else {
            Toast.makeText(this, "Please select a league.", Toast.LENGTH_SHORT).show()
            /*the toast is a message/warning to the user*/
        }
        /*the function nextClicked takes place outside of onCreate because I used the onclick section of the buttons attributes.*/
    }
}
