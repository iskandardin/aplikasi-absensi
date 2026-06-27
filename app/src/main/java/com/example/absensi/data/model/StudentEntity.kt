package com.example.absensi.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.UUID

@Entity(tableName = "students")
data class StudentEntity(
    @PrimaryKey
    val id: String = UUID.randomUUID().toString(),
    
    @ColumnInfo(name = "name")
    val name: String,
    
    @ColumnInfo(name = "student_id")
    val studentId: String,
    
    @ColumnInfo(name = "email")
    val email: String,
    
    @ColumnInfo(name = "qr_code")
    val qrCode: String,
    
    @ColumnInfo(name = "created_at")
    val createdAt: Long = System.currentTimeMillis()
)
