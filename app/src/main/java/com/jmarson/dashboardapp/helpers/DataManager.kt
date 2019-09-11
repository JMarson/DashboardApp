package com.jmarson.dashboardapp.helpers

import com.jmarson.dashboardapp.models.Course
import com.jmarson.dashboardapp.models.User
import java.time.Instant

class DataManager {

    companion object {
        val instance = DataManager()
    }

    lateinit var user: User

    init {
        loadTestData()
    }

    private fun loadTestData() {
        // TODO expand data source, handle dates
        user = User("Kier", "Smith",
            listOf(
                Course(Instant.now(), Instant.now(), "FIT1031 Lecture 01", "Arun Kongaurthu", "S4, 13 College Walk, Clayton"),
                Course(Instant.now(), Instant.now(), "FIT1075 Tutorial 11", "Jarrod Knibbe", "S3, 13 College Walk, Clayton"),
                Course(Instant.now(), Instant.now(), "FIT1078 Labratory 08", "Akshay Sapra", "144, 14 College Walk, Clayton")
            ))
    }

    fun todaysCourses() {
        // TODO filter today
    }

}