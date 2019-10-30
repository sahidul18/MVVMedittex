package com.rjt.mvvmedittex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var myMessage:Message? = null
    var messageViewModel:MessageViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        messageViewModel = MessageViewModel()
        messageViewModel = ViewModelProviders.of(this).get(MessageViewModel::class.java!!)

        messageViewModel!!.parseJson()

        button.setOnClickListener{
            var message = edit_text_message.text.toString()
            myMessage = Message(message)

            var newMessage = messageViewModel?.getMessage(myMessage!!)


            var teacherName = messageViewModel!!.tName

            if (newMessage != null && teacherName != null) {
                // toast() is an extension function in Utils
                toast(newMessage + " " + teacherName)
            }

            textView.text = newMessage + ", " + teacherName

            //Toast.makeText(this, newMessage, Toast.LENGTH_SHORT).show()
        }

    }
}
