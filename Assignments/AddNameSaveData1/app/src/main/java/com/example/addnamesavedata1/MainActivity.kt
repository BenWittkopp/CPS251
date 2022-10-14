package com.example.addnamesavedata1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.addnamesavedata1.databinding.ActivityMainBinding
import kotlin.String as String

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var namePool = ""
        var enteredName: String

        binding.button.setOnClickListener {
            enteredName = binding.editTextTextPersonName.text.toString()
            if (enteredName != "") {
                namePool = namePool + "\n" + enteredName
                binding.textView.text = namePool
            }
        }
    }
}