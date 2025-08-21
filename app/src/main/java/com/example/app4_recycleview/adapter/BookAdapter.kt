package com.example.app4_recycleview.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.app4_recycleview.R
import com.example.app4_recycleview.utils.detailbook
import com.example.app4_recycleview.model.Book

class BookAdapter(
    private val context: Context,
    private val listBuku: List<Book>
) : RecyclerView.Adapter<BookAdapter.ViewHolder>() {

    private val filteredList: MutableList<Book> = listBuku.toMutableList()

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val tvTitle = itemView.findViewById<TextView>(R.id.tv_judulbuku)
        val tvPenulis = itemView.findViewById<TextView>(R.id.tv_penulis)
        val tvTahun = itemView.findViewById<TextView>(R.id.tv_tahunterbit)
        val imgCover = itemView.findViewById<ImageView>(R.id.img_buku)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_post, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = filteredList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val book = filteredList[position]
        holder.tvTitle.text = "Judul: ${book.judul}"
        holder.tvTahun.text = "Tahun Terbit: ${book.tahun}"
        holder.tvPenulis.text = "Penulis: ${book.penulis}"

        Glide.with(holder.itemView.context)
            .load(book.cover)
            .into(holder.imgCover)

        holder.itemView.setOnClickListener {
            Toast.makeText( context, "Memilih ${book.judul}", Toast.LENGTH_SHORT).show()

            AlertDialog.Builder(context)
                .setTitle("Lihat Detail?")
                .setMessage("Ingin memilih detail dari ${book.judul}?")
                .setPositiveButton("Lihat") {_, _ ->
                    val intent = Intent(context, detailbook::class.java)
                    intent.putExtra("book_title", book.judul)
                    intent.putExtra("book_penulis", book.penulis)
                    intent.putExtra("book_tahun", book.tahun)
                    intent.putExtra("cover", book.cover)
                    context.startActivity(intent)
                }
                .setNegativeButton("Batal", null)
                .show()
        }
    }
}