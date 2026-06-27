package com.example.absensi.data.repository

import com.example.absensi.data.database.AttendanceDao
import com.example.absensi.data.model.AttendanceEntity
import kotlinx.coroutines.flow.Flow

class AttendanceRepository(private val attendanceDao: AttendanceDao) {
    
    suspend fun insertAttendance(attendance: AttendanceEntity) {
        attendanceDao.insertAttendance(attendance)
    }

    suspend fun updateAttendance(attendance: AttendanceEntity) {
        attendanceDao.updateAttendance(attendance)
    }

    suspend fun deleteAttendance(attendance: AttendanceEntity) {
        attendanceDao.deleteAttendance(attendance)
    }

    suspend fun getAttendanceById(attendanceId: String): AttendanceEntity? {
        return attendanceDao.getAttendanceById(attendanceId)
    }

    fun getAttendanceByStudent(studentId: String): Flow<List<AttendanceEntity>> {
        return attendanceDao.getAttendanceByStudent(studentId)
    }

    fun getAllAttendances(): Flow<List<AttendanceEntity>> {
        return attendanceDao.getAllAttendances()
    }

    fun getAttendancesByDate(date: String): Flow<List<AttendanceEntity>> {
        return attendanceDao.getAttendancesByDate(date)
    }
}
