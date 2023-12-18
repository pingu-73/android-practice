package com.example.learning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.learning.databinding.ActivityFourthBinding

class FourthActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFourthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFourthBinding.inflate(layoutInflater)
        val view = binding.root

        setContentView(view)
        val name = intent.getStringExtra("Extra Name")
        val age = intent.getIntExtra("Extra Age", 0)
        val str = "Data passed was ${name} and ${age}"
        binding.tvStr.text = str
    }
}