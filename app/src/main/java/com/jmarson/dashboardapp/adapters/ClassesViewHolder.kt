package com.jmarson.dashboardapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.jmarson.dashboardapp.R
import com.jmarson.dashboardapp.models.Course
import com.jmarson.dashboardapp.models.DashboardSection

class ClassesViewCreator (inflater: LayoutInflater, parent: ViewGroup, section: DashboardSection, sectionView: View) {

    init {
        section.rows.forEach {
            it as Course
            val view = inflater.inflate(R.layout.class_row, parent, false)
            view.findViewById<TextView>(R.id.startTimeTextView).text = "START TEST" //Date.from(course.startTime)
            view.findViewById<TextView>(R.id.endTimeTextView).text = "END TEST"
            view.findViewById<TextView>(R.id.courseTitleTextView).text = it.title
            view.findViewById<TextView>(R.id.courseTeacherTextView).text = it.teacher
            view.findViewById<TextView>(R.id.courseLocationTextView).text = it.location
            (sectionView as LinearLayout).addView(view)
        }
    }
}