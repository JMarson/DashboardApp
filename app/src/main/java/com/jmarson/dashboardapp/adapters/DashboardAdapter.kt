package com.jmarson.dashboardapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jmarson.dashboardapp.models.DashboardSection
import com.jmarson.dashboardapp.viewholders.DashboardSectionViewHolder

class DashboardAdapter(private val sections: List<DashboardSection>)
    : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return DashboardSectionViewHolder(inflater, parent)
    }

    override fun getItemCount(): Int = sections.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val section = sections[position]
        (holder as DashboardSectionViewHolder).bind(section)
    }
}