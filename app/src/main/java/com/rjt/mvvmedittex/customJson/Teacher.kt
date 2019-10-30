package com.rjt.mvvmedittex.customJson

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
data class Teacher(
    @SerializedName("tName")
    @Expose
    val teacherName : String
)