package com.example.myapplication

import retrofit2.Call
import retrofit2.http.GET

interface APIInterface {
    @GET(value = "results.json")
    fun getData(): Call<MyResults>
}