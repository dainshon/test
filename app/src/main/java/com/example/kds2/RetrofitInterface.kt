package com.example.kds2

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface RetrofitInterface {
    @GET("api/property?address={address}}")
    fun requestAllData(@Path("address") address: String): Call<data>

}