package com.example.test3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.test3.databinding.ActivityAbnormalAirPressureBinding
import com.example.test3.databinding.ActivityAbnormalUltrasoundWindBinding

class AbnormalUltrasoundWind : AppCompatActivity() {
    private lateinit var binding:ActivityAbnormalUltrasoundWindBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityAbnormalUltrasoundWindBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvErrorData.setOnClickListener {
            val intent=Intent(this,WindError_ErrorDataReason::class.java)
            startActivity(intent)
        }
        binding.tvNoData.setOnClickListener {
            val intent=Intent(this,WindError_NODataReason::class.java)
            startActivity(intent)
        }

    }
}