package com.example.absensi.data.repository

import com.example.absensi.data.database.StudentDao
import com.example.absensi.data.model.StudentEntity
import kotlinx.coroutines.flow.Flow

class StudentRepository(private val studentDao: StudentDao) {
    
    suspend fun insertStudent(student: StudentEntity) {
        studentDao.insertStudent(student)
    }

    suspend fun updateStudent(student: StudentEntity) {
        studentDao.updateStudent(student)
    }

    suspend fun deleteStudent(student: StudentEntity) {
        studentDao.deleteStudent(student)
    }

    suspend fun getStudentById(studentId: String): StudentEntity? {
        return studentDao.getStudentById(studentId)
    }

    fun getAllStudents(): Flow<List<StudentEntity>> {
        return studentDao.getAllStudents()
    }

    suspend fun getStudentByQRCode(qrCode: String): StudentEntity? {
        return studentDao.getStudentByQRCode(qrCode)
    }
}
