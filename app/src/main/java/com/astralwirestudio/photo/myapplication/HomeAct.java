package com.astralwirestudio.photo.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class HomeAct extends AppCompatActivity {


    /*
    *  1. Add student details screen
    *           : first name, last name, surname
    *           : standard (1-12) (optional)
    *           : technology (optional)
    *           : students mobile number, parents mobile number
    *           : joining date
    *           : gender
    *           : address
    *           : timing
    *  2. attendence screen
    *           : filter standard wise
    *
    * */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
}