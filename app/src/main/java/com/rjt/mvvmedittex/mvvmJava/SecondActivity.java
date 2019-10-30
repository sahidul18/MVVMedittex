package com.rjt.mvvmedittex.mvvmJava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.rjt.mvvmedittex.R;

public class SecondActivity extends AppCompatActivity {

    EditText mEditText;
    Button button;
    MessageViewModel viewModel;
    Message myMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        button = findViewById(R.id.button3);
        mEditText = findViewById(R.id.edit_text_message_java);
        viewModel = new MessageViewModel();


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = mEditText.getText().toString();
                myMessage = new Message(msg);

                Toast.makeText(SecondActivity.this, viewModel.getMessage(myMessage).toString(), Toast.LENGTH_SHORT).show();

            }
        });
    }
}
