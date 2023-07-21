package com.example.test3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.test3.databinding.ActivityAbnormalAirPressureBinding
import com.example.test3.databinding.ActivityMainBinding

class AbnormalAirPressure : AppCompatActivity() {
    private lateinit var binding:ActivityAbnormalAirPressureBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityAbnormalAirPressureBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvAbnormalAirPressure.setOnClickListener {
            val intent= Intent(this,AbnormalAirPressureReason::class.java)
            startActivity(intent)
        }
    }
}