package com.andeeni.alarmapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class CreateAnAlarmActivity extends AppCompatActivity{
    Button setAlarmButton;
    Button deleteAlarmButton;
    EditText inputTime;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_alarm);

        inputTime = findViewById(R.id.edittext_input_time);
        setAlarmButton = findViewById(R.id.button_set_alarm);
        deleteAlarmButton = findViewById(R.id.button_delete_alarm);


        setAlarmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });




    }


}
