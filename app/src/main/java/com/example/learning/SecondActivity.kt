package com.example.learning

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.learning.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySecondBinding.inflate(layoutInflater)
        val view = binding.root

        setContentView(view)

        var count = 0;
        binding.btnPlus.setOnClickListener {
            count++
            binding.tvCount.text = "Count: $count"
        }

        binding.btnMinus.setOnClickListener{
            if(count > 0) {
                count--
                binding.tvCount.text = "Count: $count"
            }else {
                Toast.makeText(this, "count is 0 you can't subtract more", Toast.LENGTH_LONG).show()
            }

        }

        binding.btnNextView.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }

        binding.btnPreviView.setOnClickListener {
            finish()
        }


    }
}