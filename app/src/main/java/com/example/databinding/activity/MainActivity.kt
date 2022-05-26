package com.example.databinding.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableField
import com.example.databinding.MyHandler
import com.example.databinding.R
import com.example.databinding.databinding.ActivityMainBinding
import com.example.databinding.model.Employee

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val hobbies = ArrayList<String>()
        hobbies.add("Football")
        hobbies.add("Chess")
        hobbies.add("Tennis")

        val nickname = ObservableField<String>()

        val avaratUrl = "https://images.unsplash.com/photo-1652535874141-03505f512722?crop=entropy&cs=tinysrgb&fm=jpg&ixlib=rb-1.2.1&q=60&raw_url=true&ixid=MnwxMjA3fDB8MHxlZGl0b3JpYWwtZmVlZHwxOHx8fGVufDB8fHx8&auto=format&fit=crop&w=500"

        val employee = Employee(1, "Mansur", nickname, "", 9999999.0, hobbies, avaratUrl)

        val myHandler = MyHandler()

        binding.myHandler = myHandler
        binding.employee = employee

        binding.invalidateAll() // it refreshes all objects
    }
}