package com.example.app4_recycleview.utils

import android.icu.text.CaseMap.Title
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.app4_recycleview.R

class detailbook : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detailbook)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val tvTitle = findViewById<TextView>(R.id.tvtitle_det)
        val tvPenulis = findViewById<TextView>(R.id.tvpenulis_det)
        val tvTahun = findViewById<TextView>(R.id.tvtahun_det)

        val Title = intent.getStringExtra("book_title")
        val Penulis = intent.getStringExtra("book_penulis")
        val Tahun = intent.getStringExtra("book_tahun")

        tvTitle.text = Title
        tvPenulis.text = Penulis
        tvTahun.text = Tahun
    }
}