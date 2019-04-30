package com.example.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.R
import com.example.swoosh.model.Player
import com.example.swoosh.utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_level.*

class LevelActivity : BaseActivity() {

    lateinit var player: Player
    /*this means that later we will be initialising a player of class 'Player'*/

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER, player)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level)
        player = intent.getParcelableExtra(EXTRA_PLAYER)
        /*Here we are accessing the data from the previous page, via the Extra and the constant.
    a kotlin file was created to hold the constant that was created*/
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null) {
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)
        }
    }

    fun onBeginnerClick (view: View) {
        ballerButton.isChecked = false
        player.level = "Beginner"
    }

    fun onBallerClick (view: View) {
        beginnerButton.isChecked = false
        player.level = "Baller"
    }

    fun onFinishClicked (view: View) {
        if (player.level != "") {
            val levelActivityIntent = Intent(this, FinishActivity::class.java)
            levelActivityIntent.putExtra(EXTRA_PLAYER, player)
            startActivity(levelActivityIntent)
        } else {
            Toast.makeText(this, "Please select a level.", Toast.LENGTH_SHORT).show()
        }
    }
}

