package com.example.test3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TemperatureAnomaly : AppCompatActivity() {
    private lateinit var tv_temperatureAnomaly: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_temperature_anomaly)
tv_temperatureAnomaly=findViewById(R.id.tv_temperatureAnomaly)
        tv_temperatureAnomaly.setOnClickListener {
            val intent= Intent(this,temperatureAnomalyReason::class.java)
            startActivity(intent)
        }
    }
}