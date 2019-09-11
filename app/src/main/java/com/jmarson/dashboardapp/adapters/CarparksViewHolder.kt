package com.jmarson.dashboardapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.jmarson.dashboardapp.R
import com.jmarson.dashboardapp.models.CarPark
import com.jmarson.dashboardapp.models.Course
import com.jmarson.dashboardapp.models.DashboardSection

class CarparksViewCreator (inflater: LayoutInflater, parent: ViewGroup, section: DashboardSection, sectionView: View) {

    init {
        section.rows.forEach {
            it as CarPark
            val view = inflater.inflate(R.layout.car_park_row, parent, false)
            view.findViewById<TextView>(R.id.carparkNameTextView).text = it.name
            view.findViewById<TextView>(R.id.spacesTextView).text = it.spaces.toString()
            (sectionView as LinearLayout).addView(view)
        }
    }
}