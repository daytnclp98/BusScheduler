package com.example.busschedule

import android.view.ViewGroup
import android.widget.ListAdapter
import com.example.busschedule.database.schedule.Schedule
import com.example.busschedule.viewmodels.BusScheduleViewModel

class BusStopAdapter(private val onItemClicked: (Schedule) -> Unit) : ListAdapter<Schedule, BusStopAdapter, BusScheduleViewModel>(DiffCallback) {

    override fun onCreateViewHolder(parent : ViewGroup, view)
}
