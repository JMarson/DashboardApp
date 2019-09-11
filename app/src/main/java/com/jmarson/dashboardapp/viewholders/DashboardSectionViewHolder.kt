package com.jmarson.dashboardapp.viewholders

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.jmarson.dashboardapp.R
import com.jmarson.dashboardapp.adapters.*
import com.jmarson.dashboardapp.helpers.Constants
import com.jmarson.dashboardapp.models.DashboardSection

class DashboardSectionViewHolder(val inflater: LayoutInflater, val parent: ViewGroup):
    RecyclerView.ViewHolder(
        inflater.inflate(R.layout.dashboard_section, parent, false)
    ) {

    private var title: TextView? = null
    private var sectionView: View? = null

    init {
        title = itemView.findViewById(R.id.sectionTitleTextView)
        sectionView = itemView.findViewById(R.id.sectionRows)
    }

    fun bind(section: DashboardSection) {
        if (section.title.isNullOrEmpty()) {
            title?.visibility = View.GONE
        } else {
            title?.text = section.title
        }

        when (section.type) {
            Constants.SectionTypes.CLASSES -> ClassesViewCreator(inflater, parent, section, sectionView!!)
            Constants.SectionTypes.CAR_PARK -> CarparksViewCreator(inflater, parent, section, sectionView!!)
            Constants.SectionTypes.BUS_ROUTES -> BusRoutesViewCreator(inflater, parent, section, sectionView!!)
        }
    }
}