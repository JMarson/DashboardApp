package com.jmarson.dashboardapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jmarson.dashboardapp.helpers.DataManager
import com.jmarson.dashboardapp.helpers.DateManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupUI()
    }

    private fun setupUI() {
        greetingTextView.text = DataManager.instance.user.greetingText(this)
        dateTextView.text = dateText()
    }

    private fun dateText(): String {
        return getString(
            R.string.date_text,
            DateManager.todaysDate(),
            DateManager.universityWeek(this))
    }
}
