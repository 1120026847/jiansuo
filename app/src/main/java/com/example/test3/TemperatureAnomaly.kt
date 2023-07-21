package com.example.test3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.test3.databinding.ActivityTemperatureAnomalyBinding

class TemperatureAnomaly : AppCompatActivity() {
    private lateinit var binding:ActivityTemperatureAnomalyBinding
    private lateinit var tv_temperatureAnomaly: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityTemperatureAnomalyBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvTemperatureAnomaly.setOnClickListener {
            val intent= Intent(this,temperatureAnomalyReason::class.java)
            startActivity(intent)
        }
    }
}