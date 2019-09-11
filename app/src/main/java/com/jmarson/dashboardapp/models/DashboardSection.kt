package com.jmarson.dashboardapp.models

class DashboardSection (
    val title: String? = null,
    val type: Int = 0,
    val rows: List<Any>
) {
    fun hasRows(): Boolean {
        return rows.isNotEmpty()
    }
}