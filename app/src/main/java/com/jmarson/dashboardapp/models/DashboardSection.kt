package com.jmarson.dashboardapp.models

class DashboardSection (
    val title: String? = null,
    val type: Int = 0,
    val rows: Int = 0
) {
    fun hasRows(): Boolean {
        return rows > 0
    }
}