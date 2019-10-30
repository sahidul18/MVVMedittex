package com.rjt.mvvmedittex.livedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.util.*

class LivedataViewModel:ViewModel() {

    var randomNumber:MutableLiveData<String>? = null

    fun getNumber():MutableLiveData<String>{
        if (randomNumber == null){
            randomNumber = MutableLiveData<String>()
            createNumber()
        }

        return randomNumber as MutableLiveData<String>
    }

    fun createNumber(){

        var random = Random()

        randomNumber?.postValue("Number: ${random.nextInt(10 - 1)+1}")

    }

}