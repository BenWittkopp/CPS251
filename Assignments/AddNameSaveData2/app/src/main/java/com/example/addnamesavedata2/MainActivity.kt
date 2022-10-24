package com.example.addnamesavedata2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.addnamesavedata2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel : MainViewModel
    //val viewModelProvider = ViewModelProvider(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //var namePool = ""

        binding.button.setOnClickListener {
            if (binding.editTextTextPersonName.text.toString() != "") {
                //namePool = namePool + binding.editTextTextPersonName.text.toString() + "\n"
                viewModel.addName(binding.editTextTextPersonName.text.toString())
                binding.textView.text = viewModel.getPool().toString()
            }
        }
    }
}