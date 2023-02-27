package com.example.busschedule.database.schedule
//Dayanna TENECELA
import androidx.room.Dao
import androidx.room.Query

class ScheduleDao {

    @Dao
    interface ScheduleDao{
        @Query("SELECT * FROM schedule ORDER BY arrival_time ASC")
        fun getAll(): List<Schedule>

        @Query("SELECT * FROM schedule WHERE stop_name = :stopName ORDER BY arrival_time ASC")
        fun getByStopName(stopName: String): List<Schedule>







    }


}