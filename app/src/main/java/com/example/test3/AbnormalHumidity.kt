package com.example.test3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class AbnormalHumidity : AppCompatActivity() {
    private lateinit var tv_AbnormalHumidity: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_abnormal_humidity)
        tv_AbnormalHumidity = findViewById(R.id.tv_AbnormalHumidity)
        tv_AbnormalHumidity.setOnClickListener {
            val intent= Intent(this,AbnormalHumidityReason::class.java)
            startActivity(intent)
        }
    }
}