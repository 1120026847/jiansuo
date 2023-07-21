package com.example.test3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test3.databinding.ActivityAbnormalVisibilityBinding

class AbnormalVisibility : AppCompatActivity() {
    private lateinit var binding:ActivityAbnormalVisibilityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityAbnormalVisibilityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvAbnormalVisibility.setOnClickListener {
            val intent = Intent(this,AbnormalVisibilityReason::class.java)
            startActivity(intent)
        }
    }
}