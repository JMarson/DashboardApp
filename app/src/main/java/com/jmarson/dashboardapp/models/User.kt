package com.jmarson.dashboardapp.models

import android.content.Context
import com.jmarson.dashboardapp.R

class User (
    private val firstName: String,
    private val surname: String,
    val coursesList: List<Course>) {

    /**
     * Returns constructed greeting string with user's name
     *
     * @param context The context for the function call
     * @return String for displaying greeting to the user
     */
    fun greetingText(context: Context): String {
        return context.getString(R.string.user_greeting, firstName)
    }


}