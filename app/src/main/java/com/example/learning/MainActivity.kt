package com.example.learning

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.learning.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnApply.setOnClickListener {
            var firstName: String? = null
            var lastName: String? = null
            var age: Int? = null
            var country: String? = null


            try {
                firstName = binding.etFirstName.text.toString()
            } catch (e: NumberFormatException) {
                Toast.makeText(this, "Please Enter First Name", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }


            try {
                lastName = binding.etLastName.text.toString()
            }
            catch (e: NumberFormatException) {
                lastName = null
            }


            try {
                val ageText = binding.etAge.text.toString()
                if (ageText.isNotEmpty()) {
                    age = ageText.toInt()
                } else {
                    Toast.makeText(this, "Please Input your age", Toast.LENGTH_LONG).show()
                    return@setOnClickListener
                }
            } catch (e: Exception) {
                return@setOnClickListener
            }


            try {
                country = binding.etLastName.text.toString()
            }
            catch (e: NumberFormatException) {
                lastName = null
            }
            Log.d("Main Activity", "$firstName, $lastName is $age years old and is from $country")


            Intent(this, FourthActivity::class.java).also{
                val name = it.putExtra("Extra Name", firstName)
                val age = it.putExtra("Extra Age", age)
                startActivity(it)


            }

        }

        binding.btnNextLayout.setOnClickListener {
            Intent(this, SecondActivity::class.java).also{
                startActivity(it)
            }

        }

    }
}