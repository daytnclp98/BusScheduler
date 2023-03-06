package com.example.busschedule

import android.app.Application
import com.example.busschedule.database.AppDataBse

class BusScheduleApplication : Application() {
    val database: AppDataBse by lazy { AppDataBse.getDatabase(this) }
}