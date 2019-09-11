package com.jmarson.dashboardapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.jmarson.dashboardapp.R
import com.jmarson.dashboardapp.models.BusRoute

class BusRoutesViewHolder (inflater: LayoutInflater, parent: ViewGroup):
    RecyclerView.ViewHolder(
        inflater.inflate(R.layout.shuttle_bus_row, parent, false)
    ) {

    private var originTextView: TextView? = null
    private var destinationTextView: TextView? = null
    private var minutesRemainingTextView: TextView? = null

    init {
        originTextView = itemView.findViewById(R.id.carparkNameTextView)
        destinationTextView = itemView.findViewById(R.id.spacesTextView)
        minutesRemainingTextView = itemView.findViewById(R.id.spacesTextView)
    }

    fun bind(busRoute: BusRoute) {
        originTextView?.text = busRoute.origin
        destinationTextView?.text = busRoute.destination
        minutesRemainingTextView?.text = busRoute.minutesRemaining
    }
}