package com.example.learning

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.RadioButton
import com.example.learning.databinding.ActivityMainBinding
import com.example.learning.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {

    private lateinit var binding: ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnOrder.setOnClickListener {
            val checkedBreakfast = binding.rgBreakfast.checkedRadioButtonId
            val breakfast = findViewById<RadioButton>(checkedBreakfast)
            val tea = binding.cbTea.isChecked
            val coffee = binding.cbCoffee.isChecked
            val juice = binding.cbJuice.isChecked
            val OrderString = "You ordered a ${breakfast.text} " +
                    (if(tea) "with Tea" else "") +
                    (if(coffee) "with Coffee" else "") +
                    (if(juice) "with Juice" else "")
            binding.tvOrder.text = OrderString

            Log.d("Third Activity", OrderString)
        }

        binding.btnPrevLayout.setOnClickListener {
            finish()
        }

        binding.btnNextLayout.setOnClickListener {
            Intent(this, FourthActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}