package com.rjt.mvvmedittex.customJson

import retrofit2.Call
import retrofit2.http.GET

interface SchoolApi {

    @GET("/bins/1bsqbc")
    abstract fun getSchool(): Call<School>
}