package com.example.crud_realtime_admin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.crud_realtime_admin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupUI()
    }

    private fun setupUI() {
        binding.mainUpload.setOnClickListener {
            val intent = Intent(this,UploadActivity::class.java)
            startActivity(intent)
            finish()
        }
        binding.mainUpdate.setOnClickListener {
            val intent = Intent(this,UpdateActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}