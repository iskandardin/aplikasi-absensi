package com.example.absensi.data.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.absensi.data.model.AttendanceEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface AttendanceDao {
    @Insert
    suspend fun insertAttendance(attendance: AttendanceEntity)

    @Update
    suspend fun updateAttendance(attendance: AttendanceEntity)

    @Delete
    suspend fun deleteAttendance(attendance: AttendanceEntity)

    @Query("SELECT * FROM attendances WHERE id = :attendanceId")
    suspend fun getAttendanceById(attendanceId: String): AttendanceEntity?

    @Query("SELECT * FROM attendances WHERE student_id = :studentId")
    fun getAttendanceByStudent(studentId: String): Flow<List<AttendanceEntity>>

    @Query("SELECT * FROM attendances ORDER BY check_in_time DESC")
    fun getAllAttendances(): Flow<List<AttendanceEntity>>

    @Query("SELECT * FROM attendances WHERE DATE(check_in_time) = DATE(:date)")
    fun getAttendancesByDate(date: String): Flow<List<AttendanceEntity>>
}
