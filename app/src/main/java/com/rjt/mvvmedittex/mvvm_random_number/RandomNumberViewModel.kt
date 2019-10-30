package com.rjt.mvvmedittex.mvvm_random_number

import androidx.lifecycle.ViewModel
import java.util.*

class RandomNumberViewModel : ViewModel() {

    var randomNumber:String? = null

    fun getNumber(): String? {

        if (randomNumber == null){
            createNumb()
        }

        return randomNumber
    }

    fun createNumb(){

        var random = Random()
        randomNumber = "Number ${random.nextInt(10 - 1) + 1}"
    }
}