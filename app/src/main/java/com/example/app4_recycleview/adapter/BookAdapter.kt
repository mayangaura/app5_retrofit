package com.example.app4_recycleview.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.RecyclerView
import com.example.app4_recycleview.R
import com.example.app4_recycleview.utils.detailbook
import com.example.app4_recycleview.model.Book

class BookAdapter(
    private val context: Context,
    private val bookList: List<Book>
) : RecyclerView.Adapter<BookAdapter.ViewHolder>() {

    private val filteredList: MutableList<Book> = bookList.toMutableList()

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val tvTitle = itemView.findViewById<TextView>(R.id.tv_judulbuku)
        val tvPenulis = itemView.findViewById<TextView>(R.id.tv_penulis)
        val tvTahun = itemView.findViewById<TextView>(R.id.tv_tahunterbit)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_post, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = filteredList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val book = filteredList[position]
        holder.tvTitle.text = "Judul: ${book.title}"
        holder.tvTahun.text = "Tahun Terbit: ${book.tahun}"
        holder.tvPenulis.text = "Penulis: ${book.penulis}"

        holder.itemView.setOnClickListener {
            Toast.makeText( context, "Memilih ${book.title}", Toast.LENGTH_SHORT).show()

            AlertDialog.Builder(context)
                .setTitle("Lihat Detail?")
                .setMessage("Ingin memilih detail dari ${book.title}?")
                .setPositiveButton("Lihat") {_, _ ->
                    val intent = Intent(context, detailbook::class.java)
                    intent.putExtra("book_title", book.title)
                    intent.putExtra("book_penulis", book.penulis)
                    intent.putExtra("book_tahun", book.tahun)
                    context.startActivity(intent)
                }
                .setNegativeButton("Batal", null)
                .show()
        }
    }
}