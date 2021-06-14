package com.example.practicce30.network

import com.google.android.material.shape.ShapeAppearanceModel.builder
import com.google.gson.JsonElement
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.POST

interface MyApi {

    @GET("movie/now_playing?api_key=198564c5fabf8c62626e1fefed61dad8&language=en-US&page=1")
    fun login():Single<JsonElement>



    companion object {

        operator fun invoke():MyApi{
            return Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl("https://api.themoviedb.org/3/")
                .build()
                .create(MyApi::class.java)


        }


    }







}




























//@POST()
//fun login():Single<JsonElement>
//
//
//
//companion object{
//
//    operator fun invoke():MyApi{
//        return Retrofit.Builder()
//            .addConverterFactory(GsonConverterFactory.create())
//            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
//            .baseUrl("www.someUrl.com")
//            .build()
//            .create(MyApi::class.java)
//
//    }
//
//}