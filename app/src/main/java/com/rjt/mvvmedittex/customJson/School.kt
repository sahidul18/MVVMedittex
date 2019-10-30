package com.rjt.mvvmedittex.customJson

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class School(
    @SerializedName("name")
    @Expose
    val name : String,

    @SerializedName("address")
    @Expose
    val address : String,

    @SerializedName("teacher")
    @Expose
    val teacher : Teacher
)