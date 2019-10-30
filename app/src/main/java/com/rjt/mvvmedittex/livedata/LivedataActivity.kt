package com.rjt.mvvmedittex.livedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.rjt.mvvmedittex.R
import kotlinx.android.synthetic.main.activity_livedata.*

class LivedataActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_livedata)

        val livedataViewModel = ViewModelProviders.of(this)
            .get(LivedataViewModel::class.java)

        val randomNumber = livedataViewModel.getNumber()

        randomNumber.observe(this, Observer<String> { number -> textView3.text = number })

        button2.setOnClickListener{
            livedataViewModel.createNumber()
        }
    }
}
