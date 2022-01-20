package com.example.dependencyinjectionpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dependencyinjectionpractice.databinding.ActivityMainBinding
import com.example.dependencyinjectionpractice.human.Alice
import com.example.dependencyinjectionpractice.human.Jerry

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.textView1.text = Alice().toString()
        binding.textView2.text = Jerry().toString()
    }
}