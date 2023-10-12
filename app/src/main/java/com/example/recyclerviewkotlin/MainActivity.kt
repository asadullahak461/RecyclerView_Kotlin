package com.example.recyclerviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)

        // this creates a vertical layout Manager
        recyclerview.layoutManager = LinearLayoutManager(this)




        val data = ArrayList<itemsViewModel.ItemsViewModel>()

        for (i in 1..20) {
            data.add(itemsViewModel.ItemsViewModel(R.drawable.ic_baseline_folder_24,"" + i))
        }


        val adapter = CustomAdapter(data)

        recyclerview.adapter = adapter
    }
}