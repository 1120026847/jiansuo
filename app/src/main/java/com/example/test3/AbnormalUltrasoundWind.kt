package com.example.test3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AbnormalUltrasoundWind : AppCompatActivity() {
    private lateinit var tv_noData: TextView
    private lateinit var tv_errorData: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_abnormal_ultrasound_wind)
        tv_errorData = findViewById(R.id.tv_errorData)
        tv_errorData = findViewById(R.id.tv_noData)
        tv_errorData.setOnClickListener {
            val intent=Intent(this,WindError_ErrorDataReason::class.java)
            startActivity(intent)
        }
        tv_noData.setOnClickListener {
            val intent=Intent(this,WindError_NODataReason::class.java)
            startActivity(intent)
        }

    }
}