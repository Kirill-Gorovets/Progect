package com.example.progect

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.progect.UseCase.GetUserNameUsecase
import com.example.progect.UseCase.SaveUserNameUsecase
import com.example.progect.databinding.ActivityFragmentFacultiBinding
import com.example.progect.databinding.ActivityFragmentMainBinding


class MainActivity : AppCompatActivity() {
    private var _binding: ActivityFragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding =  ActivityFragmentMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }
}