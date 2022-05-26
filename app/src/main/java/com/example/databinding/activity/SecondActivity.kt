package com.example.databinding.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.databinding.R
import com.example.databinding.adapter.ContactAdapter
import com.example.databinding.databinding.ActivityMainBinding
import com.example.databinding.model.Contact

class SecondActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var list: ArrayList<Contact>
    private lateinit var contactAdapter: ContactAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        initViews()
    }

    private fun initViews() {
        recyclerView = findViewById(R.id.rv)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        loadContacts()
    }

    private fun loadContacts() {
        list = ArrayList()
        for(i in 0..15){
            list.add(Contact("Mansur$i", "+998 97 579 77 $i"))
        }

        refreshAdapter(list)
    }

    private fun refreshAdapter(list: java.util.ArrayList<Contact>) {
        contactAdapter = ContactAdapter(list)
        recyclerView.adapter = contactAdapter
    }
}