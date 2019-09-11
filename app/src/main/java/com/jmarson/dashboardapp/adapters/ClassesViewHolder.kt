package com.jmarson.dashboardapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.jmarson.dashboardapp.R
import com.jmarson.dashboardapp.models.Course

class ClassesViewHolder (inflater: LayoutInflater, parent: ViewGroup):
    RecyclerView.ViewHolder(
        inflater.inflate(R.layout.class_row, parent, false)
    ) {

    private var startTimeTextView: TextView? = null
    private var endTimeTextView: TextView? = null
    private var courseTitleTextView: TextView? = null
    private var teacherTextView: TextView? = null
    private var locationTextView: TextView? = null

    init {
        startTimeTextView = itemView.findViewById(R.id.startTimeTextView)
        endTimeTextView = itemView.findViewById(R.id.endTimeTextView)
        courseTitleTextView = itemView.findViewById(R.id.courseTitleTextView)
        teacherTextView = itemView.findViewById(R.id.courseTeacherTextView)
        locationTextView = itemView.findViewById(R.id.courseLocationTextView)
    }

    fun bind(course: Course) {
        startTimeTextView?.text = "START TEST" //Date.from(course.startTime)
        endTimeTextView?.text = "END TEST"
        courseTitleTextView?.text = course.title
        teacherTextView?.text = course.teacher
        locationTextView?.text = course.location
    }
}