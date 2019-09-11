package com.jmarson.dashboardapp.models

import java.time.Instant

class Course (
    val startTime: Instant,
    val endTime: Instant,
    val title: String,
    val teacher: String,
    val location: String
)