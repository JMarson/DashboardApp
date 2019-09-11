package com.jmarson.dashboardapp.helpers

import android.content.Context
import android.content.res.Resources
import com.jmarson.dashboardapp.R
import java.text.SimpleDateFormat
import java.util.*

object DateManager {

    fun todaysDate(): String {
        val dateFormatter = SimpleDateFormat(Constants.dateFormat, Locale.getDefault())
        return dateFormatter.format(Date())
    }

    fun universityWeek(context: Context): String {
        return context.getString(R.string.week_text, "8")
    }
}