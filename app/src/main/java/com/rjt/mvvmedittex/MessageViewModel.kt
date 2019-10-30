package com.rjt.mvvmedittex

import retrofit2.converter.gson.GsonConverterFactory

import androidx.lifecycle.ViewModel
import com.rjt.mvvmedittex.customJson.School
import com.rjt.mvvmedittex.customJson.SchoolApi
import retrofit2.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MessageViewModel: ViewModel(){

    lateinit var tName:String

    fun getMessage(message: Message) : String{

        return message.message
    }

    fun parseJson(){
        val BASE_URL = "https://api.myjson.com"
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val service = retrofit.create(SchoolApi::class.java)

        var call:Call<School> = service.getSchool()

        call.enqueue(object :Callback<School>{
            override fun onFailure(call: Call<School>, t: Throwable) {

            }

            override fun onResponse(call: Call<School>, response: Response<School>) {
                if (!response.isSuccessful){
                    return
                }
               var result = response.body()
                tName = result?.teacher?.teacherName!!
            }

        })
    }

}