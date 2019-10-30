package com.rjt.mvvmedittex.mvvm_random_number

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import com.rjt.mvvmedittex.R
import kotlinx.android.synthetic.main.activity_random_number.*

class RandomNumberActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random_number)

        val randomNumberViewModel = ViewModelProviders.of(this)
            .get(RandomNumberViewModel::class.java)

        val random = randomNumberViewModel.getNumber()

        textView2.text = random
    }
}
