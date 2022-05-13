package com.example.kds2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.RemoteViews.RemoteCollectionItems
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import com.example.kds2.databinding.ActivityMainBinding as ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    //lateinit var adapter: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //init()

       // val call : Call<data> = ServiceImpl.service.requestAllData("송파구")

        val retrofit = Retrofit.Builder()
            .baseUrl("http://54.180.103.214:8080/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val service = retrofit.create(RetrofitInterface::class.java)

        //val call = service.requestAllData("송파구")
        Log.d("result", "test")

        service.requestAllData("송파구").enqueue(
            object : Callback<data>{
                override fun onResponse(call: Call<data>, response: Response<data>) {
                    if(response.isSuccessful){
                        var result = response.body()
                        Log.d("result", "성공: "+result?.toString())
                    }else{
                        Log.d("result", "실패")
                    }
                }
                override fun onFailure(call: Call<data>, t: Throwable) {
                    Log.d("result", "fail")
                }
            }
        )
        //loadData()
    }

//    private fun init() {
//        binding.recyclerView.layoutManager =
//            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
//        binding.recyclerView.addItemDecoration(DividerItemDecoration(this, LinearLayoutManager.VERTICAL ))
//
//        binding.recyclerView.adapter = adapter
//
//    }
//
//
//    private fun setAdapter(items: ArrayList<dataItem>){
//        val mAdapter = MyAdapter(items, this)
//        binding.recyclerView.adapter = mAdapter
//        binding.recyclerView.layoutManager = LinearLayoutManager(this)
//    }

    private fun loadData() {

//        service.requestAllData().enqueue(object : Callback<data>{
//            override fun onResponse(call: Call<data>, response: Response<data>) {
//                if(response.isSuccessful){
//                    val body = response.body()
//                    body?.let {
//                        setAdapter(it.dataitemlist)
//                    }
//                }
//            }
//
//            override fun onFailure(call: Call<data>, t: Throwable) {
//                Log.d("error", "error")
//            }
//        })

    }




}