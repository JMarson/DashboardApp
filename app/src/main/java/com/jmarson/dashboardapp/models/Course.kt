package com.jmarson.dashboardapp.models

import java.time.Instant

class Course (
    private val startTime: Instant,
    private val endTime: Instant,
    private val title: String,
    private val teacher: String,
    private val location: String
)