package com.example.mygit_v1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mygit_v1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var bindinviv : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindinviv = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindinviv.root)
    }
}