package com.example.absensi

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.absensi.databinding.ActivityMainBinding
import com.example.absensi.ui.scanner.ScannerActivity
import com.example.absensi.ui.attendance.AttendanceListActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupUI()
    }

    private fun setupUI() {
        binding.btnScanner.setOnClickListener {
            startActivity(Intent(this, ScannerActivity::class.java))
        }

        binding.btnAttendanceList.setOnClickListener {
            startActivity(Intent(this, AttendanceListActivity::class.java))
        }
    }
}
