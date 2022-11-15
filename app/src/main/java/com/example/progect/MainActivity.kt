package com.example.progect

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.progect.databinding.ActivityFragmentMainBinding


class MainActivity : AppCompatActivity() {
    private var _binding: ActivityFragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityFragmentMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }
}