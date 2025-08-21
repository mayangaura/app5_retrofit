package com.example.app4_recycleview.utils

import retrofit2.Call
import retrofit2.http.GET
import com.example.app4_recycleview.model.Book

interface ApiService {
    @GET("buku")
    fun getBuku(): Call<List<Book>>
}