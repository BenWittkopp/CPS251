package com.example.tipcalc

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import com.example.tipcalc.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.myButton.setOnClickListener {
            val priceString = binding.myTextField.text.toString()
            val price: Double? = priceString.toDoubleOrNull()
            if (price != null) {
                val price10 = (1.1) * price
                val price15 = (1.15) * price
                val price20 = (1.2) * price
                binding.myTextView.text =
                    "The tips are as follows:\n\n10% = $price10\n15% = $price15\n20% = $price20"
            } else binding.myTextView.text = "MUST ENTER A BILL AMOUNT"
        }
    }
}