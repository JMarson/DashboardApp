package com.jmarson.dashboardapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.jmarson.dashboardapp.adapters.DashboardAdapter
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

        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        dashboardRecyclerView.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(applicationContext)
            adapter = DashboardAdapter(DataManager.instance.sections)
        }
    }

    private fun dateText(): String {
        return getString(
            R.string.date_text,
            DateManager.todaysDate(),
            DateManager.universityWeek(this))
    }


}
