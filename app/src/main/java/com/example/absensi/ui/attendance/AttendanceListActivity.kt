package com.example.absensi.ui.attendance

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.absensi.databinding.ActivityAttendanceListBinding

class AttendanceListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAttendanceListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        binding = ActivityAttendanceListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupUI()
    }

    private fun setupUI() {
        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Daftar Kehadiran"
    }
}
