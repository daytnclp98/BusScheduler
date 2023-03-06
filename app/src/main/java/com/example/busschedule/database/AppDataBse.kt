package com.example.busschedule.database

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.busschedule.database.schedule.ScheduleDao

abstract class AppDataBse : RoomDatabase(){
    abstract fun scheduleDao(): ScheduleDao

    companion object{
        @Volatile
        private var INSTANCE: AppDataBse? = null

        fun getDatabase(context: Context): AppDataBse{
            return INSTANCE ?: synchronized(this){
                val instance = Room.databaseBuilder(
                    context,
                    AppDataBse:: class.java,
                    "app_database")
                    .createFromAsset("database/bus_schedule.db")
                    .build()
                INSTANCE = instance

                instance
            }
        }
    }
}