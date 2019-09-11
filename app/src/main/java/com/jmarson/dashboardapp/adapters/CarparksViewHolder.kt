package com.jmarson.dashboardapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.jmarson.dashboardapp.R
import com.jmarson.dashboardapp.models.CarPark
import com.jmarson.dashboardapp.models.Course

class CarparksViewHolder (inflater: LayoutInflater, parent: ViewGroup):
    RecyclerView.ViewHolder(
        inflater.inflate(R.layout.car_park_row, parent, false)
    ) {

    private var carparkNameTextView: TextView? = null
    private var remainingSpacesTextView: TextView? = null

    init {
        carparkNameTextView = itemView.findViewById(R.id.carparkNameTextView)
        remainingSpacesTextView = itemView.findViewById(R.id.spacesTextView)
    }

    fun bind(carpark: CarPark) {
        carparkNameTextView?.text = carpark.name
        remainingSpacesTextView?.text = carpark.spaces.toString()
    }
}