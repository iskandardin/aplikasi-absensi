package com.example.absensi.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import java.util.UUID

@Entity(
    tableName = "attendances",
    foreignKeys = [
        ForeignKey(
            entity = StudentEntity::class,
            parentColumns = ["id"],
            childColumns = ["student_id"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class AttendanceEntity(
    @PrimaryKey
    val id: String = UUID.randomUUID().toString(),
    
    @ColumnInfo(name = "student_id")
    val studentId: String,
    
    @ColumnInfo(name = "check_in_time")
    val checkInTime: String,
    
    @ColumnInfo(name = "check_out_time")
    val checkOutTime: String? = null,
    
    @ColumnInfo(name = "status")
    val status: String = "PRESENT", // PRESENT, LATE, ABSENT
    
    @ColumnInfo(name = "notes")
    val notes: String? = null,
    
    @ColumnInfo(name = "created_at")
    val createdAt: Long = System.currentTimeMillis()
)
