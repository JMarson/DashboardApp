package com.jmarson.dashboardapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jmarson.dashboardapp.helpers.Constants
import com.jmarson.dashboardapp.models.DashboardSection
import com.jmarson.dashboardapp.viewholders.DashboardSectionViewHolder

class DashboardAdapter(private val sections: List<DashboardSection>)
    : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return when (viewType) {
            Constants.SectionTypes.CLASSES -> ClassesViewHolder(inflater, parent)
            Constants.SectionTypes.CAR_PARK -> CarparksViewHolder(inflater, parent)
            Constants.SectionTypes.BUS_ROUTES -> BusRoutesViewHolder(inflater, parent)
            else -> DashboardSectionViewHolder(inflater, parent)
        }
    }

    override fun getItemCount(): Int = sections.size

    override fun getItemViewType(position: Int): Int {
        super.getItemViewType(position)
        val item = sections[position].type
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val section = sections[position]
        if (section.type == Constants.SectionTypes.HEADER) {
            (holder as DashboardSectionViewHolder).bind(section)
        } else if (section.type == Constants.SectionTypes.CLASSES) {
            (holder as ClassesViewHolder).bind(section.)
        } else if (section.type == Constants.SectionTypes.CAR_PARK) {
            (holder as CarparksViewHolder).bind(section)
        } else if (section.type == Constants.SectionTypes.BUS_ROUTES) {
            (holder as BusRoutesViewHolder).bind(section)
        }
    }
}