package com.jmarson.dashboardapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.jmarson.dashboardapp.R
import com.jmarson.dashboardapp.models.BusRoute
import com.jmarson.dashboardapp.models.CarPark
import com.jmarson.dashboardapp.models.DashboardSection

class BusRoutesViewCreator (inflater: LayoutInflater, parent: ViewGroup, section: DashboardSection, sectionView: View) {

    init {
        section.rows.forEach {
            it as BusRoute
            val view = inflater.inflate(R.layout.shuttle_bus_row, parent, false)
            view.findViewById<TextView>(R.id.originTextView).text = it.origin
            view.findViewById<TextView>(R.id.destinationTextView).text = it.destination
            view.findViewById<TextView>(R.id.arrivalTextView).text = it.minutesRemaining
            (sectionView as LinearLayout).addView(view)
        }
    }
}