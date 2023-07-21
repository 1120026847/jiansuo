package com.example.test3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.test3.databinding.ActivityAbnormalHumidityBinding

class AbnormalHumidity : AppCompatActivity() {
    private lateinit var binding:ActivityAbnormalHumidityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityAbnormalHumidityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvAbnormalHumidity.setOnClickListener {
            val intent= Intent(this,AbnormalHumidityReason::class.java)
            startActivity(intent)
        }
    }
}