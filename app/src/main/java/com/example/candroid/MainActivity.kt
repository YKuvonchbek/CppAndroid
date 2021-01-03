package com.example.candroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.candroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private external fun sayHi(): String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textview.text = sayHi()
    }

    companion object {
        init {
            System.loadLibrary("myLibName")
        }
    }
}