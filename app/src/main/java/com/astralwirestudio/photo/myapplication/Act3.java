package com.astralwirestudio.photo.myapplication;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.timepicker.MaterialTimePicker;

import java.util.Calendar;

public class Act3 extends AppCompatActivity implements View.OnClickListener {

    ProgressBar p1, p2;

    Button alert, Time, Date;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_3);

        p2 = findViewById(R.id.progressBar2);
        p2.setProgress(40);

        alert = findViewById(R.id.button2);
        Time = findViewById(R.id.button3);
        Date = findViewById(R.id.button4);

        alert.setOnClickListener(this);
        Time.setOnClickListener(this);
        Date.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button2:

                AlertDialog al = new AlertDialog.Builder(Act3.this).
                        setTitle("My alert").setMessage("Alert dialogue message").
                        setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(Act3.this, "Ok", Toast.LENGTH_SHORT).show();
                    }
                }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(Act3.this, "Cancel", Toast.LENGTH_SHORT).show();
                    }
                }).setNeutralButton("Neutral", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(Act3.this, "Nutral Button", Toast.LENGTH_SHORT).show();
                    }
                }).setCancelable(false).create();
                al.show();

                break;
            case R.id.button3:
                Toast.makeText(Act3.this, "Time Button", Toast.LENGTH_SHORT).show();

                Calendar c1 =Calendar.getInstance();
                int CurHour =c1.get(Calendar.HOUR);

                MaterialTimePicker tp = new MaterialTimePicker.Builder().setTitleText("My Time Picker").setHour(CurHour).build();
                tp.show(getSupportFragmentManager(),"Tag 1");



//                Toast.makeText(Act3.this, ""+tp.getHour() + " "+tp.getMinute(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.button4:
                Toast.makeText(Act3.this, "Date Button", Toast.LENGTH_SHORT).show();

                MaterialDatePicker mp =  MaterialDatePicker.Builder.datePicker().setTitleText("My Date picker").build();
                mp.show(getSupportFragmentManager(),"tag 2");

                break;
        }
    }
}
