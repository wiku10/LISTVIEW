package com.example.mylistviewwiku

import android.R.layout.simple_list_item_1
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val languages = listOf("Phyton","KOTLIN","JavaScript","PHP","RUBY")


        LISTVIEW.adapter = ArrayAdapter(this, simple_list_item_1, languages)


        LISTVIEW.setOnItemClickListener{ parent, view, position, id ->
            Toast.makeText(this, "Anda Memilih: ${languages[position]}",Toast.LENGTH_SHORT).show()

        }
    }
}
