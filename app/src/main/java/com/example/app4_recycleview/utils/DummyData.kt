package com.example.app4_recycleview.utils

import com.example.app4_recycleview.model.Book


class DummyData {
    fun getSiswaList(): List<Book> {
        val list: MutableList<Book> = ArrayList<Book>()
        list.add(Book("Bumi", "Tere Liye", "2022"))
        list.add(Book("Kehidupan Mayang", "Aura Chan", "2022"))
        list.add(Book("Dheva filosofi", "Depay", "2025"))
        list.add(Book("Salsa dopo pride", "Salsa", "2024"))
        list.add(Book("RYG kondang", "Rayyugg", "2023"))
        return list
    }
}