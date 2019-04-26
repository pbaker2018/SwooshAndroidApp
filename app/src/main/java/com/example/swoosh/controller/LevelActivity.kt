package com.example.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.utilities.EXTRA_LEAGUE
import com.example.swoosh.R
import com.example.swoosh.utilities.EXTRA_LEVEL
import kotlinx.android.synthetic.main.activity_level.*

class LevelActivity : BaseActivity() {

    var league = ""
    var level = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level)
        league = intent.getStringExtra(EXTRA_LEAGUE)
    }
    /*Here we are accessing the data from the previous page, via the Extra and the constant.
    a kotlin file was created to hold the constant that was created*/

    fun onBeginnerClick (view: View) {
        ballerButton.isChecked = false
        level = "Beginner"

    }

    fun onBallerClick (view: View) {
        beginnerButton.isChecked = false
        level = "Baller"
    }

    fun onFinishClicked (view: View) {
        if (level != "") {
            val levelActivityIntent = Intent(this, FinishActivity::class.java)
            levelActivityIntent.putExtra(EXTRA_LEAGUE, league)
            levelActivityIntent.putExtra(EXTRA_LEVEL, level)
            startActivity(levelActivityIntent)
        } else {
            Toast.makeText(this, "Please select a level.", Toast.LENGTH_SHORT).show()
        }
    }
}

