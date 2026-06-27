package com.example.absensi.data.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.absensi.data.model.StudentEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface StudentDao {
    @Insert
    suspend fun insertStudent(student: StudentEntity)

    @Update
    suspend fun updateStudent(student: StudentEntity)

    @Delete
    suspend fun deleteStudent(student: StudentEntity)

    @Query("SELECT * FROM students WHERE id = :studentId")
    suspend fun getStudentById(studentId: String): StudentEntity?

    @Query("SELECT * FROM students")
    fun getAllStudents(): Flow<List<StudentEntity>>

    @Query("SELECT * FROM students WHERE qr_code = :qrCode")
    suspend fun getStudentByQRCode(qrCode: String): StudentEntity?
}
