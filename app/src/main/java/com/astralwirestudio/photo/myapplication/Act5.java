package com.astralwirestudio.photo.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Act5 extends AppCompatActivity implements View.OnClickListener {

    Button b6, b7, b8, b9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act5);

        b6 = findViewById(R.id.button6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        b7 = findViewById(R.id.button7);
        b7.setOnClickListener(this);

        b8 = findViewById(R.id.button8);
        b8.setOnClickListener(this);

        b9 = findViewById(R.id.button9);
        b9.setOnClickListener(this);

    }

    public void clickMethod(View view) {


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button7:


                break;
            case R.id.button8:


                break;
            case R.id.button9:


                break;
        }
    }
}