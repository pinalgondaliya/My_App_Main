package com.astralwirestudio.photo.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;

import com.astralwirestudio.photo.myapplication.utils.MyKeys;

public class Act4 extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_3);

       Intent i1 = getIntent();

      String data = i1.getStringExtra(MyKeys.key1);

    }
}
