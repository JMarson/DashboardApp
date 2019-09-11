package com.jmarson.dashboardapp.viewholders

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.jmarson.dashboardapp.R
import com.jmarson.dashboardapp.models.DashboardSection

class DashboardSectionViewHolder(inflater: LayoutInflater, parent: ViewGroup):
    RecyclerView.ViewHolder(
        inflater.inflate(R.layout.dashboard_section, parent, false)
    ) {

    private var title: TextView? = null

    init {
        title = itemView.findViewById(R.id.sectionTitleTextView)
    }

    fun bind(section: DashboardSection) {
        if (section.title.isNullOrEmpty()) {
            title?.visibility = View.GONE
        } else {
            title?.text = section.title
        }
    }
}