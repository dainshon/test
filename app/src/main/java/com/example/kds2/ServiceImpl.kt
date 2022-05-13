package com.example.kds2

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ServiceImpl {
    val retrofit = Retrofit.Builder()
        .baseUrl("http://54.180.103.214:8080")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val service = retrofit.create(RetrofitInterface::class.java)

}